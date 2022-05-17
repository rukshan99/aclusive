package com.aclusive.orderservice.service;

import com.aclusive.orderservice.domain.Order;

public interface OrderService {
    public Order saveOrder(Order order);
}