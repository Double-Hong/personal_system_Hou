package com.example.personal_system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

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
@TableName("financial_management")
public class FinancialManagementEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("user_name")
    private String userName;

    @TableField("my_time")
    private String myTime;

    @TableField("my_event")
    private String myEvent;

    @TableField("consume_type")
    private String consumeType;

    @TableField("consume_money")
    private Double consumeMoney;

    @TableField("consume_status")
    private Boolean consumeStatus;


}
