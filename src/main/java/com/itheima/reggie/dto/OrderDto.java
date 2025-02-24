package com.itheima.reggie.dto;


import java.util.List;

import com.itheima.reggie.entity.OrderDetail;
import com.itheima.reggie.entity.Orders;

import lombok.Data;

@Data
public class OrderDto extends Orders {

    private List<OrderDetail> orderDetails;
}
