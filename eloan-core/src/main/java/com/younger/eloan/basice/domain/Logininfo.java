package com.younger.eloan.basice.domain;

public class Logininfo {

    public static final int NORMAL = 0;// 正常状态
    public static final int LOCK = 1;// 用户锁定
    public static final int OFF = -1;// 注销

    public static final int NORMAL_USER = 0;// 前台用户
    public static final int MANAGE_USER = 1;// 后台用户

    private int userType = NORMAL_USER;// 用户类型,用于区分前台还是后台用户

    private Long id;

    private String username;

    private String password;

    private Integer state=NORMAL;

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    private Integer usertype;

    private Boolean admin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }
}