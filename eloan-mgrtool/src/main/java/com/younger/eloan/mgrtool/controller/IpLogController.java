package com.younger.eloan.mgrtool.controller;

import com.younger.eloan.basice.query.IpLogQueryObject;
import com.younger.eloan.basice.service.IIpLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台日志管理
 */
public class IpLogController extends BaseController {

    @Autowired
    private IIpLogService iIpLogService;

    @RequestMapping("/ipLog")
    public String ipLog(IpLogQueryObject qo, Model model) {
        model.addAttribute("pageResult",this.iIpLogService.query(qo));
        return "ipLog/list";
    }
}
