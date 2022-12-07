package com.example.personal_system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("address_book")
public class AddressBookEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("user_name")
    private String userName;

    @TableField("contact_person_name")
    private String contactPersonName;

    @TableField("relation")
    private String relation;

    @TableField("email")
    private String email;

    @TableField("phone")
    private String phone;

    @TableField("qq")
    private String qq;

    @TableField("remark")
    private String remark;
}
