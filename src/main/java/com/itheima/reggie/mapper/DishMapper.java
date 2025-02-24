package com.itheima.reggie.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.Dish;

/**
 * @author frx
 * @version 1.0
 * @date 2022/5/8  22:55
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
