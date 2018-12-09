package com.younger.eloan.uiweb.controller;

import com.younger.eloan.basice.query.IpLogQueryObject;
import com.younger.eloan.basice.service.IIpLogService;
import com.younger.eloan.basice.util.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户日志信息
 */
@Controller
public class IpLogController extends  BaseController{

    @Autowired
    private IIpLogService iIpLogService;

    @RequestMapping("/ipLog")
    public String ipLog(IpLogQueryObject queryObject, Model model){
        queryObject.setUsername(UserContext.getLoginfo().getUsername());
        model.addAttribute("pageResult",this.iIpLogService.query(queryObject));
        return "iplog_list";
    }
}
