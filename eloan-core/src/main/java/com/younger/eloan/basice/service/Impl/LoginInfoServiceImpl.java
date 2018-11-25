package com.younger.eloan.basice.service.Impl;

import com.younger.eloan.basice.domain.Account;
import com.younger.eloan.basice.domain.Logininfo;
import com.younger.eloan.basice.domain.Userinfo;
import com.younger.eloan.basice.mapper.AccountMapper;
import com.younger.eloan.basice.mapper.LogininfoMapper;
import com.younger.eloan.basice.mapper.UserinfoMapper;
import com.younger.eloan.basice.service.ILoginInfoService;
import com.younger.eloan.basice.util.BitConst;
import com.younger.eloan.basice.util.MD5;
import com.younger.eloan.basice.util.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.security.auth.login.LoginException;
import java.util.function.Predicate;

@Service("loginInfoService")
public class LoginInfoServiceImpl implements ILoginInfoService {

    @Autowired
    private LogininfoMapper logininfoMapper;

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private UserinfoMapper userinfoMapper;

    @Override
    public void register(String userName, String pwd,int userType) {
        //判断用户是否存在
        int count = this.logininfoMapper.selectCountByUserName(userName,userType);

        if(count>=1){
            new LoginException("用户已经存在");
        }
        //不存在则注册用户
        Logininfo logininfo = new Logininfo();
        logininfo.setUsername(userName);
        logininfo.setPassword(MD5.encode(pwd));
        //用户状态
        logininfo.setState(Logininfo.STATE_NORMAL);
        //用户为前台用户
        logininfo.setUserType(logininfo.USERTYPE_USER);
        logininfoMapper.insert(logininfo);

        //创建用户的关联信息
        Account account = new Account();
        account.setId(logininfo.getId());

        account.setRemainborrowlimit(BitConst.BORROW_LIMIT);
        account.setBorrowlimitamount(BitConst.BORROW_LIMIT);
        this.accountMapper.insert(account);

        //创建用户相关联的用户信息
        Userinfo userinfo = new Userinfo();
        userinfo.setId(logininfo.getId());
        this.userinfoMapper.insert(userinfo);
    }
    @Override
    public boolean checkUserName(String name,int userType) {
        int count = this.logininfoMapper.selectCountByUserName(name,userType);
        boolean isexsit = isexsit(count, (e) -> {
            if (e >= 1) {
                return false;
            } else {
                return true;
            }
        });
        return isexsit;
    }

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    @Override
    public Logininfo login(String username, String password,int userType) {
        password = MD5.encode(password);
        Logininfo logininfo = logininfoMapper.selectByUserNameAndPassword(username,password,userType);
        if(logininfo!=null){
            UserContext.setLoginInfo(logininfo);
        }
        return logininfo;
    }

    @Override
    public boolean hasAdminUser() {
        int count =  this.logininfoMapper.selectUserTypeCount(Logininfo.USERTYPE_USER);
        return count>0;
    }

    /**
     * 创建系统管理员用户
     */
    @Override
    public void createDefaultAdmin() {

        Logininfo logininfo = new Logininfo();
        logininfo.setUsername(BitConst.DEFAULT_ADMIN_NAME);
        logininfo.setPassword(MD5.encode(BitConst.DEFAULT_ADMIN_PASSWORD));
        logininfo.setState(Logininfo.STATE_NORMAL);
        logininfo.setUsertype(Logininfo.MANAGE_USER);
        logininfo.setAdmin(true);
        this.logininfoMapper.insert(logininfo);
    }

    private  boolean isexsit(int count, Predicate<Integer> p){
        return  p.test(count);
    }


}
