package com.yyy.WalletLocker.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.yyy.WalletLocker.util.DateUtils;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

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
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd",timezone =
            DateUtils.TIMEZONE)
    private Date loanBeginDate;

    /**
     * ???
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd",timezone =
            DateUtils.TIMEZONE)
    private Date billDate;

    /**
     * ??????

     */
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd",timezone =
            DateUtils.TIMEZONE)
    private Date repaymentDate;

    /**
     * ??

     */
    private Byte period;

    /**
     * ??????
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd",timezone =
            DateUtils.TIMEZONE)
    private Date crtTime;

    /**
     * ??????

     */
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd",timezone =
            DateUtils.TIMEZONE)
    private Date uptTime;

    private static final long serialVersionUID = 1L;
}
