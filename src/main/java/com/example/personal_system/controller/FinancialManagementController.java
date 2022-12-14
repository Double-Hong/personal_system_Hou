package com.example.personal_system.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.personal_system.entity.FinancialManagementEntity;
import com.example.personal_system.mapper.FinancialManagementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Double-Hong
 * @since 2022-11-22 09:26:34
 */
@RestController
@RequestMapping("/financial-management-entity")
public class FinancialManagementController {

    @Autowired
    FinancialManagementMapper financialManagementMapper;

    @GetMapping("/getTotalMoney/{type},{username},{status}")
    public Double getTotalMoney(@PathVariable String type, @PathVariable String username, @PathVariable Boolean status){
        if (financialManagementMapper.totalMoney(type,username,status)==null){
            return (double) 0;
        }
        else {
            return financialManagementMapper.totalMoney(type,username,status);
        }
    }

    @GetMapping("/getBillByUsername/{username}")
    public List<FinancialManagementEntity> getBillByUsername(@PathVariable String username){
        return financialManagementMapper.selectList(new QueryWrapper<FinancialManagementEntity>().eq("user_name",username));
    }

    @PostMapping("/insertBill")
    public Integer insertBill(@RequestBody FinancialManagementEntity financialManagement){
        UUID uuid = UUID.randomUUID();
        String id = uuid.toString();
        financialManagement.setId(id);
        return financialManagementMapper.insert(financialManagement);
    }

    @PostMapping("/updateBill")
    public Integer updateBill(@RequestBody FinancialManagementEntity financialManagement){
        return financialManagementMapper.updateById(financialManagement);
    }

    @GetMapping("/deleteBill/{id}")
    public Integer deleteBill(@PathVariable String id){
        return financialManagementMapper.deleteById(id);
    }
}
