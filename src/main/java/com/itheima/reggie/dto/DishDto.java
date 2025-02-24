package com.itheima.reggie.dto;

import java.util.ArrayList;
import java.util.List;

import com.itheima.reggie.entity.Dish;
import com.itheima.reggie.entity.DishFlavor;

import lombok.Data;

@Data
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
