package com.example.personal_system.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.personal_system.entity.AddressBookEntity;
import com.example.personal_system.entity.UserEntity;
import com.example.personal_system.mapper.AddressBookMapper;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Double-Hong
 * @since 2022-11-22 09:26:34
 */
@RestController
@RequestMapping("/address-book-entity")
public class AddressBookController {

    @Autowired
    AddressBookMapper addressBookMapper;

    @PostMapping("/getBookByUsername")
    public List<AddressBookEntity> getBookByUsername(@RequestBody UserEntity user) {
        return addressBookMapper.selectList(new QueryWrapper<AddressBookEntity>().eq("user_name", user.getUserName()));
    }

    @PostMapping("/updateById")
    public Integer updateById(@RequestBody AddressBookEntity addressBook) {
        return addressBookMapper.updateById(addressBook);
    }

    @PostMapping("/insertBook")
    public Integer insertBook(@RequestBody AddressBookEntity addressBook) {
        UUID uuid = UUID.randomUUID();
        String id = uuid.toString();
        addressBook.setId(id);
        return addressBookMapper.insert(addressBook);
    }

    @GetMapping("/deleteById/{id}")
    public Integer deleteById(@PathVariable String id) {
        return addressBookMapper.deleteById(id);
    }

    @GetMapping("/findPeopleByName/{name},{username}")
    public List<AddressBookEntity> findPeopleByName(@PathVariable String name, @PathVariable String username) {
        return addressBookMapper.selectList(new QueryWrapper<AddressBookEntity>().like("contact_person_name", name).eq("user_name", username));
    }
}
