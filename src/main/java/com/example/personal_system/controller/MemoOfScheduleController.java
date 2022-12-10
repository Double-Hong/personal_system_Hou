package com.example.personal_system.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.personal_system.entity.MemoOfScheduleEntity;
import com.example.personal_system.mapper.MemoOfScheduleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Double-Hong
 * @since 2022-11-22 09:26:34
 */
@RestController
@RequestMapping("/memo-of-schedule-entity")
public class MemoOfScheduleController {

    @Autowired
    MemoOfScheduleMapper memoOfScheduleMapper;

    @GetMapping("/getMemoOfScheduleByUsername/{username}")
    public List<MemoOfScheduleEntity> getMemoOfScheduleById(@PathVariable String username){
        return memoOfScheduleMapper.selectList(new QueryWrapper<MemoOfScheduleEntity>().eq("user_name",username));
    }

}
