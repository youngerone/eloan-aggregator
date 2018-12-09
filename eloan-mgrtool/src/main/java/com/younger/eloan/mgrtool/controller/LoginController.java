package com.younger.eloan.mgrtool.controller;

import com.younger.eloan.basice.domain.Logininfo;
import com.younger.eloan.basice.service.ILoginInfoService;
import com.younger.eloan.basice.util.LoginException;
import com.younger.eloan.basice.util.ResultJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户后台登录
 */
@Controller
public class LoginController extends BaseController {

    @Autowired
    private ILoginInfoService loginInfoService;

    @ResponseBody
    @RequestMapping("/login")
    public ResultJSON login(String userName, String password, HttpServletRequest request){
        ResultJSON result = new ResultJSON();
        try {
            String ip = request.getRemoteAddr();
            Logininfo logininfo = loginInfoService.login(userName,password,Logininfo.MANAGE_USER,ip);
            if(logininfo==null){
                throw new LoginException("用户名或密码错误",103);
            }
        }catch (Exception e){
            result.setMsg(e.getMessage());
            result.setSuccess(false);
        }
        return result;
    }
}
