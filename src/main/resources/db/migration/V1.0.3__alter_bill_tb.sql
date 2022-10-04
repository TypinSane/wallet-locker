ALTER TABLE `walletlocker_main_db`.`bill_tb`
    MODIFY COLUMN `plat_name` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'the loan platform name ' AFTER `id`,
    MODIFY COLUMN `total_amount` double NULL DEFAULT 0.00 COMMENT 'total money need to
repay' AFTER
        `plat_name`,
    MODIFY COLUMN `avg_amout` double NULL DEFAULT 0.00 COMMENT 'need to repay average
month ' AFTER
        `total_amount`,
    MODIFY COLUMN `total_interest` double NULL DEFAULT 0.00 COMMENT 'total interest'
        AFTER
        `avg_amout`,
    MODIFY COLUMN `avg_interest` double NULL DEFAULT 0.00 COMMENT 'interest every month'
        AFTER
        `total_interest`,
    MODIFY COLUMN `loan_begin_date` date NULL DEFAULT null COMMENT 'the date of loan '
        AFTER
        `avg_interest`,
    MODIFY COLUMN `repayment_date` date NULL DEFAULT null COMMENT '每月还款时间\n' AFTER
        `loan_begin_date`,
    MODIFY COLUMN `period` tinyint(4) NULL DEFAULT 0 COMMENT '期数\n' AFTER
        `repayment_date`,
    MODIFY COLUMN `crt_time` date NULL DEFAULT NULL COMMENT '数据创建时间' AFTER `period`,
    MODIFY COLUMN `upt_time` date NULL DEFAULT NULL COMMENT '数据修改时间\n' AFTER `crt_time`;
