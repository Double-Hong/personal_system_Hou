package com.example.personal_system.controller;

import com.example.personal_system.entity.PersonalMissionPlanEntity;
import com.example.personal_system.service.PersonalMissionPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
@RequestMapping("/personal-mission-plan-entity")
public class PersonalMissionPlanController {
    @Autowired
    PersonalMissionPlanService pmService;
    @GetMapping("/getAllMisson")
    public List<PersonalMissionPlanEntity> getAllMission(){
        return pmService.getAllMisson();
    }
}
