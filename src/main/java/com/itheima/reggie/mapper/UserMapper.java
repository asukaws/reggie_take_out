package com.itheima.reggie.mapper;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.User;

/**
 * @author frx
 * @version 1.0
 * @date 2022/5/30  15:10
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
