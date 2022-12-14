package com.example.personal_system.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.personal_system.entity.MemoOfScheduleEntity;
import com.example.personal_system.mapper.MemoOfScheduleMapper;
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
@RequestMapping("/memo-of-schedule-entity")
public class MemoOfScheduleController {

    @Autowired
    MemoOfScheduleMapper memoOfScheduleMapper;

    @GetMapping("/getMemoOfScheduleByUsername/{username}")
    public List<MemoOfScheduleEntity> getMemoOfScheduleById(@PathVariable String username) {
        return memoOfScheduleMapper.selectList(new QueryWrapper<MemoOfScheduleEntity>().eq("user_name", username));
    }

    @PostMapping("/updateSchedule")
    public Integer updateSchedule(@RequestBody MemoOfScheduleEntity memoOfScheduleEntity) {
        return memoOfScheduleMapper.updateById(memoOfScheduleEntity);
    }

    @PostMapping("/insertSchedule")
    public Integer insertSchedule(@RequestBody MemoOfScheduleEntity memoOfSchedule) {
        UUID uuid = UUID.randomUUID();
        String id = uuid.toString();
        memoOfSchedule.setId(id);
        return memoOfScheduleMapper.insert(memoOfSchedule);
    }

    @GetMapping("/deleteById/{id}")
    public Integer deleteById(@PathVariable String id) {
        return memoOfScheduleMapper.deleteById(id);
    }

    @GetMapping("/findSchedule/{username},{search}")
    public List<MemoOfScheduleEntity> findSchedule(@PathVariable String username, @PathVariable String search) {
        System.out.println(username);
        System.out.println(search);

        return memoOfScheduleMapper.selectList(new QueryWrapper<MemoOfScheduleEntity>().eq("user_name", username).and(i -> i.like("my_event", search)));
    }
}
