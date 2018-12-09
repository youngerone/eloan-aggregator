package com.younger.eloan.uiweb.controller;

import com.younger.eloan.basice.domain.Logininfo;
import com.younger.eloan.basice.service.IAccountService;
import com.younger.eloan.basice.service.IUserInfoService;
import com.younger.eloan.basice.util.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 个人中心的相关业务
 */
public class PersonalController extends BaseController{

    @Autowired
    private IAccountService accountService;

    @Autowired
    private IUserInfoService userInfoService;

    /**
     * 个人相关的业务
     * @return
     */
    @RequestMapping("/personal")
    public String personal(Model model){
        Logininfo current = UserContext.getLoginfo();
        model.addAttribute("accout",accountService.getAccount(current.getId()));
        model.addAttribute("userinfo",userInfoService.getUserInfo(current.getId()));
        return "personal";
    }

}
