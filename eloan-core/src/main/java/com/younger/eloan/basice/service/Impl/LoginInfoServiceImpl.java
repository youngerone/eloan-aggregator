package com.younger.eloan.basice.service.Impl;

import com.younger.eloan.basice.domain.Logininfo;
import com.younger.eloan.basice.mapper.LogininfoMapper;
import com.younger.eloan.basice.service.ILoginInfoService;
import com.younger.eloan.basice.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.security.auth.login.LoginException;

@Service("loginInfoService")
public class LoginInfoServiceImpl implements ILoginInfoService {

    @Autowired
    private LogininfoMapper logininfoMapper;

    @Override
    public void register(String userName, String pwd) {
        //判断用户是否存在
        int count = this.logininfoMapper.selectCountByUserName(userName);

        if(count>=1){
            new LoginException("用户已经存在");
        }
        //不存在则注册用户
        Logininfo logininfo = new Logininfo();
        logininfo.setUsername(userName);
        logininfo.setPassword(MD5.encode(pwd));
        logininfo.setState(Logininfo.NORMAL);
        logininfoMapper.insert(logininfo);
    }

    @Override
    public boolean checkUserName(String name) {
        int count = this.logininfoMapper.selectCountByUserName(name);
      // int count=0;
        if(count>=1){
            return false;
        }
        return true;
    }
}
