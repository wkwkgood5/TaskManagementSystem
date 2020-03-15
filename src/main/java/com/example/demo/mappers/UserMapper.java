package com.example.demo.mappers;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper{
    //查询全部
    //在这里我利用了sql优化，之查出相应的字段，避免出现*号
    @Select("select * from task")
    List<User> selectUserByName();


    @Delete("delete from task where id = #{id}")
    int deleteById(@Param("id") String id);

    @Insert({ "insert into student(id, level, description, date, pic) values(#{id}, #{level}, #{description}, #{data}, #{pic})" })
    int add(User user);

    @Update("update student set (id, level, description, date, pic)=(#{level}, #{description}, #{data}, #{pic}) where id=#{id}")
    int update(User user);
}