package com.example.personal_system.mapper;

import com.example.personal_system.entity.PersonalMissionPlanEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Double-Hong
 * @since 2022-11-22 09:26:34
 */
@Mapper
public interface PersonalMissionPlanMapper extends BaseMapper<PersonalMissionPlanEntity> {

    @Select("select * from personal_mission_plan")
    List<PersonalMissionPlanEntity> getAllMisson();
}
