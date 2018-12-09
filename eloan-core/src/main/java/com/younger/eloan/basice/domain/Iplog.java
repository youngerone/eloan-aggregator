package com.younger.eloan.basice.domain;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

/**
 * 记录日志信息
 */
@Setter
@Getter
public class Iplog extends  BaseDomain{

    public static final int LOGIN_FAIL = 0;

    public static final int LOGIN_SUCCESS=1;

    private String ip;

    private int loginstate;

    private String username;

    private Long logininfoid;

    private int logintype;

    private Date logintime;

    public Iplog(){}

    public Iplog(String ip, int loginstate, String username, Long logininfoid, int logintype) {
        this.ip = ip;
        this.loginstate = loginstate;
        this.username = username;
        this.logininfoid = logininfoid;
        this.logintype = logintype;
    }


}