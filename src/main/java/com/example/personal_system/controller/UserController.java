package com.example.personal_system.controller;

import com.example.personal_system.entity.GenericityMessage;
import com.example.personal_system.entity.UserEntity;
import com.example.personal_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Double-Hong
 * @since 2022-11-22 09:26:34
 */
@RestController
@RequestMapping("/user-entity")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println("id == > " + id);
        return "Hello,Spring Boot!";
    }

    @GetMapping("/getAllUser")
    public List<UserEntity> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("/getPassword/{name}")
    public List<UserEntity> getPassword(@PathVariable String name) {
        System.out.println(name);
        return userService.getPassword(name, "");
    }

    @PostMapping("/checkUser")
    public String checkUser(@RequestBody UserEntity user) {
        System.out.println(user.getUserName() + "+" + user.getPassword());
        List<UserEntity> userEntities = userService.getPassword(user.getUserName(), user.getPassword());
        System.out.println(userEntities.size());
        if (userEntities.size() != 0) {
            System.out.println(userEntities.get(0).getUserName());
        } else {
            System.out.println("没有该用户名");
        }
        return "OK";
    }

    @PostMapping("/checkUserMessage")
    public GenericityMessage<UserEntity> checkUserMessage(@RequestBody UserEntity user) {
        List<UserEntity> userEntities = userService.getPassword(user.getUserName(), user.getPassword());
        GenericityMessage<UserEntity> message;
        if (userEntities.size() != 0) {
            message = new GenericityMessage<>(userEntities.get(0), "登录成功");
        } else {
            message = new GenericityMessage<>(null, "用户名或密码错误");
        }
        return message;
    }

    @PostMapping("/getUser")
    public List<UserEntity> getUser(@RequestBody UserEntity user) {
        return userService.getUser(user.getUserName());
    }
    @PostMapping("/updateUserInfo")
    public Integer updateUserInfo(@RequestBody UserEntity user){
        System.out.println(user);
        return userService.updateUserInfo(user);
    }
}
