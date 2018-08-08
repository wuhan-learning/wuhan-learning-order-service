package com.otr.wuhan.learning.orderservice.controller;

import com.otr.wuhan.learning.orderservice.entity.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
    @GetMapping("/{id}")
    public Order getUserById(@PathVariable("id") String id) {
        return new Order("1", "2");
    }
}
