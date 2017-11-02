package com.zems.person.dao.mapper;

import com.zems.person.dao.entity.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    @Delete({
        "delete from user",
        "where userID = #{userid,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long userid);

    @Insert({
        "insert into user (userID, name, ",
        "password, DataChange_LastTime, ",
        "DataChange_CreateTime)",
        "values (#{userid,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{datachangeLasttime,jdbcType=TIMESTAMP}, ",
        "#{datachangeCreatetime,jdbcType=TIMESTAMP})"
    })
    int insert(User record);

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    @Select({
        "select",
        "userID, name, password, DataChange_LastTime, DataChange_CreateTime",
        "from user",
        "where userID = #{userid,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="userID", property="userid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="DataChange_LastTime", property="datachangeLasttime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DataChange_CreateTime", property="datachangeCreatetime", jdbcType=JdbcType.TIMESTAMP)
    })
    User selectByPrimaryKey(Long userid);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
        "update user",
        "set name = #{name,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "DataChange_LastTime = #{datachangeLasttime,jdbcType=TIMESTAMP},",
          "DataChange_CreateTime = #{datachangeCreatetime,jdbcType=TIMESTAMP}",
        "where userID = #{userid,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(User record);
}