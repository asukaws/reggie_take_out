package com.itheima.reggie.dto;


import java.util.List;

import com.itheima.reggie.entity.OrderDetail;
import com.itheima.reggie.entity.Orders;

import lombok.Data;

/**
 * @author frx
 * @version 1.0
 * @date 2022/7/15  20:06
 */
@Data
public class OrderDto extends Orders {

    private List<OrderDetail> orderDetails;
}
