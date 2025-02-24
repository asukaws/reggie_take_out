package com.itheima.reggie.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.Employee;

/**
 * @author frx
 * @version 1.0
 * @date 2022/4/27  21:27
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
