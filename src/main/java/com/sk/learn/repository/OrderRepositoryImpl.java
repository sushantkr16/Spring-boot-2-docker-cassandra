package com.sk.learn.repository;

import com.sk.learn.dto.Order;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryImpl {

    public Order getOrderDetails () {
        Order order = new Order();
        return order;
    }

    public Order createdOrderDetails () {
        Order order = new Order();
        return order;
    }
}
