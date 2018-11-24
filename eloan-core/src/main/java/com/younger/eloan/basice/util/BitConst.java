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
}
