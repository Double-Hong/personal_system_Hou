package com.example.personal_system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@Getter
@Setter
@Accessors(chain = true)
@TableName("financial_management")
@ApiModel(value = "FinancialManagementEntity对象", description = "")
public class FinancialManagementEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("user_name")
    private String userName;

    @TableField("income")
    private BigDecimal income;

    @TableField("outcome")
    private BigDecimal outcome;

    @TableField("my_time")
    private LocalDateTime myTime;

    @TableField("my_event")
    private String myEvent;


}
