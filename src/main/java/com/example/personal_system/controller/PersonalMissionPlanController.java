package com.example.personal_system.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.personal_system.entity.PersonalMissionPlanEntity;
import com.example.personal_system.mapper.PersonalMissionPlanMapper;
import com.example.personal_system.service.PersonalMissionPlanService;
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
@RequestMapping("/personal-mission-plan-entity")
public class PersonalMissionPlanController {
    @Autowired
    PersonalMissionPlanService pmService;

    @Autowired
    PersonalMissionPlanMapper personalMissionPlanMapper;

    @GetMapping("/getAllMisson")
    public List<PersonalMissionPlanEntity> getAllMission() {
        return pmService.getAllMisson();
    }

    @GetMapping("/getMissionById/{name}")
    public List<PersonalMissionPlanEntity> getMissionById(@PathVariable String name) {
        return personalMissionPlanMapper.selectList
                (new QueryWrapper<PersonalMissionPlanEntity>().eq("user_name", name));
    }

    @GetMapping("/deleteMissionById/{id}")
    public Integer deleteMissionById(@PathVariable String id) {
        return personalMissionPlanMapper.deleteById(id);
    }

    @PostMapping("/insertMission")
    public Integer insertMission(@RequestBody PersonalMissionPlanEntity personalMissionPlanEntity) {
        UUID uuid = UUID.randomUUID();
        String id = uuid.toString();
        personalMissionPlanEntity.setId(id);
        return personalMissionPlanMapper.insert(personalMissionPlanEntity);
    }

    @PostMapping("/updateById")
    public Integer updateById(@RequestBody PersonalMissionPlanEntity personalMissionPlanEntity) {
        return personalMissionPlanMapper.updateById(personalMissionPlanEntity);
    }

    @GetMapping("/findMission/{search},{username}")
    public List<PersonalMissionPlanEntity> findMission(@PathVariable String search, @PathVariable String username) {
        return personalMissionPlanMapper.selectList
                (new QueryWrapper<PersonalMissionPlanEntity>().eq("user_name", username).and(i -> i.like("my_event_name", search).or().like("event_describe", search)));
    }

}
