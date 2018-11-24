package com.younger.eloan.basice.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Logininfo extends  BaseDomain {

    public static final int NORMAL = 0;// 正常状态
    public static final int LOCK = 1;// 用户锁定
    public static final int OFF = -1;// 注销

    public static final int NORMAL_USER = 0;// 前台用户
    public static final int MANAGE_USER = 1;// 后台用户

    private int userType = NORMAL_USER;// 用户类型,用于区分前台还是后台用户

    private String username;

    private String password;

    private Integer state=NORMAL;

    private Integer usertype;

    private Boolean admin;

}