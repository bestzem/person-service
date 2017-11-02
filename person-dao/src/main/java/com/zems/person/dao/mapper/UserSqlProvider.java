package com.zems.person.dao.mapper;

import com.zems.person.dao.entity.User;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

public class UserSqlProvider {

    public String insertSelective(User record) {
        BEGIN();
        INSERT_INTO("user");
        
        if (record.getUserid() != null) {
            VALUES("userID", "#{userid,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            VALUES("password", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getDatachangeLasttime() != null) {
            VALUES("DataChange_LastTime", "#{datachangeLasttime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDatachangeCreatetime() != null) {
            VALUES("DataChange_CreateTime", "#{datachangeCreatetime,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(User record) {
        BEGIN();
        UPDATE("user");
        
        if (record.getName() != null) {
            SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            SET("password = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getDatachangeLasttime() != null) {
            SET("DataChange_LastTime = #{datachangeLasttime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDatachangeCreatetime() != null) {
            SET("DataChange_CreateTime = #{datachangeCreatetime,jdbcType=TIMESTAMP}");
        }
        
        WHERE("userID = #{userid,jdbcType=BIGINT}");
        
        return SQL();
    }
}