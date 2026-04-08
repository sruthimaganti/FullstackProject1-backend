package com.gallery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gallery.model.Orders;
import com.gallery.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    OrderRepository repo;

    public Orders placeOrder(Orders order) {

        return repo.save(order);
    }

    public List<Orders> getOrders(){

        return repo.findAll();
    }

}