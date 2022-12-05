package com.example.personal_system.service;

import com.example.personal_system.entity.PersonalMissionPlanEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.personal_system.mapper.PersonalMissionPlanMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Double-Hong
 * @since 2022-11-22 09:26:34
 */
public interface PersonalMissionPlanService extends IService<PersonalMissionPlanEntity> {

    List<PersonalMissionPlanEntity> getAllMisson();


}
