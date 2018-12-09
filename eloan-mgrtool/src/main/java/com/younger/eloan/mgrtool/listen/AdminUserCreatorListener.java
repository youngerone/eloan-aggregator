package com.younger.eloan.mgrtool.listen;

import com.younger.eloan.basice.service.ILoginInfoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


/**
 * spring的监听器
 */

@Component
public class AdminUserCreatorListener implements ApplicationListener<ContextRefreshedEvent> {

    private static final Logger logger = Logger.getLogger(AdminUserCreatorListener.class);

    @Autowired
    private ILoginInfoService loginInfoService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        logger.info("正在监听是否存在管理员...");
        if(!loginInfoService.hasAdminUser()){
            logger.info("正在创建管理员账户");
            loginInfoService.createDefaultAdmin();
            logger.info("管理员账户创建完成");
        }
    }
}
