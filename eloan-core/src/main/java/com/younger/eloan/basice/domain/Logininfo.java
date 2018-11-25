package com.younger.eloan.basice.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Logininfo extends  BaseDomain {

    /**
     *  普通用户状态
     */
    public static final int STATE_NORMAL = 0;
    /**
     *  用户锁定
     */
    public static final int LOCK = 1;
    /**
     * 用户注销
     */
    public static final int OFF = -1;

    public static final int NORMAL_USER = 0;// 前台用户
    public static final int MANAGE_USER = 1;// 后台用户

    private int userType = NORMAL_USER;// 用户类型,用于区分前台还是后台用户

    private String username;

    private String password;

    /**
     * 用户状态
     */
    private Integer state=STATE_NORMAL;

    /**
     * 用户类型
     */
    private Integer usertype;

    private Boolean admin;

    /**
     * 平台用户
     */
    public final static  int USERTYPE_USER=1;

    /**
     * 后台操作员
     */
    public final static int USERTYPE_SALESMAN=2;

}