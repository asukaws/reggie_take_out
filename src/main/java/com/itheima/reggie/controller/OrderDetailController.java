package com.itheima.reggie.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itheima.reggie.service.OrderDetailService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author frx
 * @version 1.0
 * @date 2022/6/6  21:26
 */
@Slf4j
@RestController
@RequestMapping("/orderDetail")
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;
}
