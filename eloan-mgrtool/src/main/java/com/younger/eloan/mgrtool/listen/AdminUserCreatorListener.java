package com.younger.eloan.mgrtool.listen;

import com.younger.eloan.basice.service.ILoginInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


/**
 * spring的监听器
 */

@Component
public class AdminUserCreatorListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private ILoginInfoService loginInfoService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        if(!loginInfoService.hasAdminUser()){
            loginInfoService.createDefaultAdmin();
        }
    }
}
