package com.yyy.WalletLocker.model;

import lombok.Data;

import java.io.Serializable;
import java.text.SimpleDateFormat;

/**
 * @Author：yuanyao
 * @Description:
 * @Time：10:33 上午, 2022/10/4,10,2022
 * @Modified By:
 */

@Data
public class LoanData implements Serializable {
    private Integer id;

    /**
     * the loan platform name
     */
    private String platName;

    /**
     * total money need to
     repay
     */
    private Double totalAmount;

    /**
     * need to repay average
     month
     */
    private Double avgAmout;

    /**
     * total interest
     */
    private Double totalInterest;

    /**
     * interest every month
     */
    private Double avgInterest;

    /**
     * the date of loan
     */
    private SimpleDateFormat loanBeginDate;

    /**
     * ???
     */
    private SimpleDateFormat billDate;

    /**
     * ??????

     */
    private SimpleDateFormat repaymentDate;

    /**
     * ??

     */
    private Byte period;

    /**
     * ??????
     */
    private SimpleDateFormat crtTime;

    /**
     * ??????

     */
    private SimpleDateFormat uptTime;

    private static final long serialVersionUID = 1L;
}
