package com.younger.eloan.basice.util;

/**
 * 用户状态类，记录用户在平台使用系统中所有的状态。
 */
public class BitStatesUtils {

    // 用户绑定手机状态码
    public final static Long OP_BIND_PHONE = 1L;

    // 用户绑定邮箱状态码
    public final static Long OP_BIND_EMAIL = 2L << 0;

    // 用户填写基本资料状态码
    public final static Long OP_BASE_INFO = 2L << 1;

    //用户实名认证状态码
    public final static Long OP_REAL_AUTH = 2L << 2;

    //用户视频认证状态码
    public final static Long OP_VEDIO_AUTH = 2L << 3;

    //用户的当前有一个标正在审核流程中
    public final static Long OP_HAS_BIDREQUST_IN_PROCESS = 2L << 4;

    //用户绑定银行卡
    public final static Long OP_BIND_BANKINFO = 2L << 5;

    //用户当前是否有提现申请
    public final static Long OP_HAS_MONEYWITHDRAW = 2L << 6;


    /**
     * @param states
     *            所有状态值
     * @param value
     *            需要判断状态值
     * @return 是否存在
     */
    public static boolean hasState(long states, long value) {
        return (states & value) != 0;
    }

    /**
     * @param states
     *            已有状态值
     * @param value
     *            需要添加状态值
     * @return 新的状态值
     */
    public static long addState(long states, long value) {
        if (hasState(states, value)) {
            return states;
        }
        return (states | value);
    }

    /**
     * @param states
     *            已有状态值
     * @param value
     *            需要删除状态值
     * @return 新的状态值
     */
    public static long removeState(long states, long value) {
        if (!hasState(states, value)) {
            return states;
        }
        return states ^ value;
    }

    public static void  main(String[] args){

        //2L<<4

        //0000 0001

        //0000 0010

        //0010 0000

        //2×2*2*2*2*2

    }

}
