package com.itheima.reggie.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.dto.SetmealDto;
import com.itheima.reggie.entity.Setmeal;

public interface SetmealService extends IService<Setmeal> {

    /**
     * 新增套餐，同时需要保存套餐和菜品的关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，同时需要删除套餐和菜品关联的数据
     * @param ids
     */
    public void removeWithDish(List<Long> ids);


    /**
     * 回显套餐数据：根据套餐id查询套餐
     * @return
    */
    SetmealDto getDate(Long id);
}
