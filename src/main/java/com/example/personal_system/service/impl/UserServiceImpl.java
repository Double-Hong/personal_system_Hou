package com.example.personal_system.service.impl;

import com.example.personal_system.entity.UserEntity;
import com.example.personal_system.mapper.UserMapper;
import com.example.personal_system.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Double-Hong
 * @since 2022-11-22 09:26:34
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

}
