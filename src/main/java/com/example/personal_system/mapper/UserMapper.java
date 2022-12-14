package com.example.personal_system.mapper;

import com.example.personal_system.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author Double-Hong
 * @since 2022-11-22 09:26:34
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {

    //所有用户信息
    @Select("select * from user")
    List<UserEntity> getAllUser();

    //用户名和密码
    @Select(("select user_name,password from user where user_name = #{name} and password = #{password}"))
    List<UserEntity> getPassword(String name, String password);

    @Select("select * from user where user_name = #{userName}")
    List<UserEntity> getUser(String userName);
}
