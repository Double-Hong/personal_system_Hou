package com.example.personal_system.service.impl;

import com.example.personal_system.entity.PersonalMissionPlanEntity;
import com.example.personal_system.mapper.PersonalMissionPlanMapper;
import com.example.personal_system.service.PersonalMissionPlanService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Double-Hong
 * @since 2022-11-22 09:26:34
 */
@Service
public class PersonalMissionPlanServiceImpl extends ServiceImpl<PersonalMissionPlanMapper, PersonalMissionPlanEntity> implements PersonalMissionPlanService {

    @Autowired
    PersonalMissionPlanMapper pmMapper;
    public List<PersonalMissionPlanEntity> getAllMisson(){
        return pmMapper.getAllMisson();
    }
}
