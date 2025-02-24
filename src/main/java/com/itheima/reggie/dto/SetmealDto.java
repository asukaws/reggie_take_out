package com.itheima.reggie.dto;

import java.util.List;

import com.itheima.reggie.entity.Setmeal;
import com.itheima.reggie.entity.SetmealDish;

import lombok.Data;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
