package com.younger.eloan.uiweb.controller;

import com.younger.eloan.basice.domain.Logininfo;
import com.younger.eloan.basice.service.ILoginInfoService;
import com.younger.eloan.basice.util.LoginException;
import com.younger.eloan.uiweb.util.ResultJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户登录
 */
@Controller
public class LoginController extends  BaseController{

    @Autowired
    private ILoginInfoService loginInfoService;

    @ResponseBody
    @RequestMapping("/login")
    public ResultJSON login(String username,String password){
        ResultJSON  json = new ResultJSON(true);
        try{
            Logininfo login = loginInfoService.login(username, password);
            if(login==null){
                throw new LoginException("用户名或密码错误",103);
            }
        }catch (Exception e){
            json.setSuccess(false);
            json.setMsg(e.getMessage());
        }
        return json;
    }
}
