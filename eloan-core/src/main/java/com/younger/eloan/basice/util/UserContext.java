package com.younger.eloan.basice.util;

import com.younger.eloan.basice.domain.Logininfo;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 用来保存用户的登录信息
 */
public class UserContext {
    public static final String LOGININFO_IN_SESSION="logininfo";

    private static HttpServletRequest getRequest(){
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }

    public static Logininfo  getLoginfo(){
        return (Logininfo) getRequest().getSession().getAttribute(LOGININFO_IN_SESSION);
    }

    public static void setLoginInfo(Logininfo loginInfo) {
        getRequest().getSession().setAttribute(LOGININFO_IN_SESSION, loginInfo);
    }
}
