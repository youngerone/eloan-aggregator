package com.younger.eloan.basice.domain;

import com.younger.eloan.basice.util.BitStatesUtils;
import com.younger.eloan.basice.util.MaskUtil;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Userinfo  extends  BaseDomain{
    /**
     * 版本号
     */
    private int version;

    /**
     * 位状态
     */
    private Long bitState=0L;

    /**
     * 对应实名认证中的真实姓名
     */
    private String realName;

    /**
     * 对应实名认证中的身份证号
     */
    private String idNumber;

    /**
     * 手机号
     */
    private String phoneNumber = "";

    //============会员的基本资料=========

    /**
     * 月收入
     */
    private Systemdictionaryitem incomeGrade;

    /**
     * 婚姻情况
     */
    private Systemdictionaryitem marriage;

    /**
     * 子女情况
     */
    private Systemdictionaryitem kidCount;

    /**
     * 学历
     */
    private Systemdictionaryitem educationBackground;

    /**
     * 住房条件
     */
    private Systemdictionaryitem houseCondition;

    public static Userinfo empty(Long id) {
        Userinfo info = new Userinfo();
        info.setId(id);
        info.setBitState(0L);
        return info;
    }

    public String getAnonymousRealName() {
        return MaskUtil.getAnonymousRealName(realName);
    }

    public String getAnonymousIdNumber() {
        return MaskUtil.getAnonymousIdNumber(idNumber);
    }


    /**
     * 添加一个状态码
     */
    public void addBitState(Long bitstate) {
        this.bitState = BitStatesUtils.addState(this.bitState, bitstate);
    }

    /**
     * 去掉一个状态码
     */
    public void removeBitState(Long bitstate) {
        this.bitState = BitStatesUtils.removeState(this.bitState, bitstate);
    }

    /**
     * 判断当前用户是否手机认证
     */
    public boolean getIsBindPhone() {
        return BitStatesUtils.hasState(this.bitState, BitStatesUtils.OP_BIND_PHONE);
    }

    /**
     * 判断当前用户是否邮箱绑定
     */
    public boolean getIsBindEmail() {
        return BitStatesUtils.hasState(this.bitState, BitStatesUtils.OP_BIND_EMAIL);
    }

    /**
     * 判断当前用户是否填写基本资料
     */
    public boolean getIsBaseInfo() {
        return BitStatesUtils.hasState(this.bitState, BitStatesUtils.OP_BASE_INFO);
    }

    /**
     * 判断当前用户是否实名认证
     */
    public boolean getIsRealAuth() {
        return BitStatesUtils.hasState(this.bitState, BitStatesUtils.OP_REAL_AUTH);
    }

    /**
     * 判断当前用户是否实名认证
     */
    public boolean getIsVedioAuth() {
        return BitStatesUtils.hasState(this.bitState, BitStatesUtils.OP_VEDIO_AUTH);
    }

    /**
     * 判断当前用户是否绑定银行卡
     */
    public boolean getIsBindBankInfo() {
        return BitStatesUtils.hasState(this.bitState, BitStatesUtils.OP_BIND_BANKINFO);
    }

    /**
     * 判断当前用户是否有一个提现申请在审核中
     */
    public boolean getIsHaveWithdraw() {
        return BitStatesUtils.hasState(this.bitState, BitStatesUtils.OP_HAS_MONEYWITHDRAW);
    }

    /**
     * 判断当前用户是否有一个借款在审核流程中
     *
     * @return
     */
    public boolean getHasProcessBidrequest() {
        return BitStatesUtils.hasState(this.bitState, BitStatesUtils.OP_HAS_BIDREQUST_IN_PROCESS);
    }


}