ALTER TABLE `walletlocker_main_db`.`bill_tb`
    ADD COLUMN `bill_date` date NULL COMMENT '账单日' AFTER `loan_begin_date`;