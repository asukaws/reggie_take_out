package com.itheima.reggie.mapper;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
