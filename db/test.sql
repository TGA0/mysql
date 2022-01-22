create database test;
use test;
drop table if exists user;
create table user (
    id           bigint(20)      not null auto_increment    comment '用户ID',
    username     varchar(30)     not null                   comment '用户账号',
    password     varchar(100)    default ''                 comment '密码',
    primary key (id)
) engine=innodb auto_increment=100 comment = '用户信息表';

-- ----------------------------
-- 初始化-用户信息表数据
-- ----------------------------
insert into user values(1,   'admin', '$2a$10$7JB720yubVSZvUI0rEqK/.VqGOZTH.ulu33dHOiBE8ByOhJIrdAu2');
insert into user values(2,   'test',  '$2a$10$7JB720yubVSZvUI0rEqK/.VqGOZTH.ulu33dHOiBE8ByOhJIrdAu2');
