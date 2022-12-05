package com.example.personal_system.service;

import com.example.personal_system.entity.UserEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.sql.Wrapper;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Double-Hong
 * @since 2022-11-22 09:26:34
 */
public interface UserService extends IService<UserEntity> {

    List<UserEntity> getAllUser();

    List<UserEntity> getPassword(String name,String password);

    List<UserEntity> getUser(String userName);

    Integer updateUserInfo(UserEntity user);
}
