CREATE TABLE `bill_tb` (
                           `id` int(11) NOT NULL,
                           `plat_name` varchar(32) DEFAULT NULL,
                           `total_amount` double DEFAULT NULL,
                           `avg_amout` double DEFAULT NULL,
                           `total_interest` double DEFAULT NULL,
                           `avg_interest` double DEFAULT NULL,
                           `loan_begin_date` date DEFAULT NULL,
                           `repayment_date` date DEFAULT NULL,
                           `period` tinyint(4) DEFAULT NULL,
                           `crt_time` date DEFAULT NULL,
                           `upt_time` date DEFAULT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;