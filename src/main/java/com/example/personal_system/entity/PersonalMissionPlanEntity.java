package com.example.personal_system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author Double-Hong
 * @since 2022-11-22 09:26:34
 */
@Data
@Getter
@Setter
@Accessors(chain = true)
@TableName("personal_mission_plan")
public class PersonalMissionPlanEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("user_name")
    private String userName;

    @TableField("my_event_name")
    private String myEventName;

    @TableField("event_describe")
    private String eventDescribe;

    @TableField("end_time")
    private String endTime;

    @TableField("completion_status")
    private Boolean completionStatus;


}
