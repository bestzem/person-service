CREATE TABLE user
(
  userID bigint(20) NOT NULL auto_increment  comment '自增长主键' primary key,
  name varchar(20) NOT NULL DEFAULT '' COMMENT '用户ID',
  password varchar(20) NOT NULL DEFAULT '' COMMENT '用户ID',
  DataChange_CreateTime datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  DataChange_LastTime datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '记录更新时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表'