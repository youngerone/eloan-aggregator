package com.younger.eloan.basice.domain;

import com.younger.eloan.basice.util.BitConst;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class Account extends BaseDomain {
    /**
     * 交易密码
     */
    private String tradepassword;

    /**
     *可用余额
     */
    private BigDecimal usableamount= BitConst.SERO;

    /**
     * 冻结金额
     */
    private BigDecimal freezedamount = BitConst.SERO;

    /**
     * 账户待收利息
     */
    private BigDecimal borrowlimitamount = BitConst.SERO;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 账户待收利息
     */
    private BigDecimal unreceiveinterest = BitConst.SERO;

    /**
     * 账户待收本金
     */
    private BigDecimal unreceiveprincipal = BitConst.SERO;

    /**
     * 账户待还金额
     */
    private BigDecimal unreturnamount;

    /**
     * 账户剩余授信额度
     */
    private BigDecimal remainborrowlimit = BitConst.SERO;

    /**
     * 授信额度
     */
    private BigDecimal borrowLimitAmount = BitConst.SERO;


}