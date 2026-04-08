package com.gallery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gallery.model.Orders;
import com.gallery.service.OrderService;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins="*")
public class OrderController {

    @Autowired
    OrderService service;

    @PostMapping
    public Orders placeOrder(@RequestBody Orders order){

        return service.placeOrder(order);
    }

    @GetMapping
    public List<Orders> getOrders(){

        return service.getOrders();
    }

}