package com.younger.eloan.basice.util;

import java.math.BigDecimal;

/**
 * 系统的常量信息
 */
public class BitConst {

    //显示精度
    public static  final int DISP_SCALE=2;

    //数据保存精度
    public static  final int SCALE = 4;

    //数据计算过程中的精度
    public static  final int CAL_SCALE=8;

    //0的精度
    public static  final BigDecimal SERO = new BigDecimal("0.0000");

    //初始化账户余额
    public static final BigDecimal BORROW_LIMIT = new BigDecimal("2000.0000");

    //系统后台默认的账号
    public final static String DEFAULT_ADMIN_NAME="admin";

    //系统后台默认的密码
    public final static String DEFAULT_ADMIN_PASSWORD="admin123456";
}
