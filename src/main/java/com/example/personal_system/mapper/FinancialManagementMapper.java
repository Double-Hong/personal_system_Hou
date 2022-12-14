package com.example.personal_system.mapper;

import com.example.personal_system.entity.FinancialManagementEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Double-Hong
 * @since 2022-11-22 09:26:34
 */
@Mapper
public interface FinancialManagementMapper extends BaseMapper<FinancialManagementEntity> {

    @Select("select sum(consume_money) from financial_management where consume_type = #{type} and user_name =#{username} and consume_status=#{status}")
    Double totalMoney(String type,String username,Boolean status);

}
