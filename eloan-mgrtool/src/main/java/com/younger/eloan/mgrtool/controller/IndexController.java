package com.younger.eloan.mgrtool.controller;

import com.younger.eloan.basice.domain.BaseDomain;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台登录进入管理员界面
 */
@Controller
public class IndexController extends BaseController {
    @RequestMapping("/index")
    public String index(){
        return "main";
    }
}
