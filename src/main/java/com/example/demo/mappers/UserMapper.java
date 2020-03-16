package com.example.demo.mappers;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper{

    @Select("select * from task")
    List<User> selectUserByName();


    @Delete("delete from task where id = #{id}")
    int deleteById(@Param("id") String id);

    @Insert({ "insert into task(id, level, description, date, pic) values(#{id}, #{level}, #{description}, #{data}, #{pic})" })
    int add(User user);

    @Update("update task set (id, level, description, date, pic)=(#{level}, #{description}, #{data}, #{pic}) where id=#{id}")
    int update(User user);
}
