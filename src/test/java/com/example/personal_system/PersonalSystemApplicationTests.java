package com.example.personal_system;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.personal_system.entity.AddressBookEntity;
import com.example.personal_system.entity.PersonalMissionPlanEntity;
import com.example.personal_system.entity.UserEntity;
import com.example.personal_system.mapper.AddressBookMapper;
import com.example.personal_system.mapper.PersonalMissionPlanMapper;
import com.example.personal_system.mapper.UserMapper;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Wrapper;
import java.util.List;
import java.util.UUID;

@SpringBootTest
class PersonalSystemApplicationTests {
    @Autowired
    UserMapper usermapper;
    @Autowired
    AddressBookMapper addressBookMapper;
    @Autowired
    PersonalMissionPlanMapper personalMissionPlanMapper;
    @Test
    void contextLoads() {
    }

    @Test
    void test(){
//        List<user> list=usermapper.selectList(null);
//        list.forEach(System.out::println);

        UserEntity myUser ;
//        myUser=usermapper.selectById(003);
//        System.out.println(myUser);
//
//        List<PersonalMissionPlanEntity> list=personalMissionPlanMapper.selectList(null);
//        list.forEach(System.out::println);
//        System.out.println(list.get(0).getMyEvent());
//        List <UserEntity> list = usermapper.getAllUser();
//        List<UserEntity> list = usermapper.selectList(new QueryWrapper<UserEntity>().gt("age",20));
//        List<UserEntity> list = usermapper.selectList(null);
//        list.forEach(System.out::println);
//        UUID uuid = UUID.randomUUID();
//        String id=uuid.toString();
//        System.out.println(id+" "+id.length());
//        List<AddressBookEntity> list = addressBookMapper.selectList(null);
//        list.forEach(System.out::println);
        List<AddressBookEntity> list =addressBookMapper.selectList(
                new QueryWrapper<AddressBookEntity>().eq("user_name","001"));
        list.forEach(System.out::println);
    }
}
