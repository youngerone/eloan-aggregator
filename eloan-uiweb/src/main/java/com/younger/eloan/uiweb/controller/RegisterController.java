package com.younger.eloan.uiweb.controller;

import com.younger.eloan.basice.service.ILoginInfoService;
import com.younger.eloan.uiweb.util.ResultJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegisterController extends BaseController {

    @Autowired
    private ILoginInfoService loginInfoService;

    @RequestMapping("/register")
    @ResponseBody
    public ResultJSON register(String username,String password){
        try {
            this.loginInfoService.register(username,password);
            return new ResultJSON(true,"注册成功");
        }catch (Exception e){
            return  new ResultJSON(false,e.getMessage());
        }
    }

    @ResponseBody
    @RequestMapping(value = "/checkUsername")
    public ResultJSON checkUsername(String username){
        return new ResultJSON(this.loginInfoService.checkUserName(username));
    }
}
