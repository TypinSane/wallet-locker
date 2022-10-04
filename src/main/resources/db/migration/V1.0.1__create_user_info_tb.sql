Drop table if exists user;
CREATE TABLE `user_info_tb` (
                                `id` bigint unsigned NOT NULL auto_increment primary key,
                                `username` varchar(15) NOT NULL DEFAULT 'UnKnownUser'
                                    comment '用户名',
                                `password` varchar(20) NOT NULL DEFAULT
                                    'password'comment '密码',
                                `phone_num` char(20) NOT NULL DEFAULT 'phoneNum' comment '手机号',
                                `identify_num` char(20) NOT NULL DEFAULT 'idNum' comment '身份证号',
                                `email` varchar(30) NOT NULL DEFAULT 'xxxxx@xxx.com'
                                    comment '电子邮箱',
                                `nick_name` varchar(15) NOT NULL DEFAULT 'Tom' comment
                                    '昵称',
                                `addr` varchar(50) NOT NULL DEFAULT 'Living SomeWhere'
                                    comment '住址',
                                `crt_time` timestamp DEFAULT NOW() comment '创建时间',
                                `upd_time` timestamp DEFAULT NOW()comment '更新时间'

) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='用户信息表' ;