package com.yyy.WalletLocker.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * bill_tb
 * @author 
 */
@Data
public class BillTb implements Serializable {
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
    private Date loanBeginDate;

    /**
     * ???
     */
    private Date billDate;

    /**
     * ??????

     */
    private Date repaymentDate;

    /**
     * ??

     */
    private Byte period;

    /**
     * ??????
     */
    private Date crtTime;

    /**
     * ??????

     */
    private Date uptTime;

    private static final long serialVersionUID = 1L;
}