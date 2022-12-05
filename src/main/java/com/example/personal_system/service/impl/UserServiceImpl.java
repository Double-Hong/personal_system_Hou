package com.example.personal_system.service.impl;

import com.example.personal_system.entity.UserEntity;
import com.example.personal_system.mapper.UserMapper;
import com.example.personal_system.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Double-Hong
 * @since 2022-11-22 09:26:34
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

    @Autowired
    UserMapper userMapper;

    public List<UserEntity> getAllUser() {
        return userMapper.getAllUser();
    }

    public List<UserEntity> getPassword(String name, String password) {
        return userMapper.getPassword(name, password);
    }

    public List<UserEntity> getUser(String userName){
        return userMapper.getUser(userName);
    }

    @Override
    public Integer updateUserInfo(UserEntity user) {
        return userMapper.updateById(user);
    }

}
