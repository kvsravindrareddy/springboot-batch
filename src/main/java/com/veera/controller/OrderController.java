package com.veera.controller;

import com.veera.model.Order;
import com.veera.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/order")
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }
}