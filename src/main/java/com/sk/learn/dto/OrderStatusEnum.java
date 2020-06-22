package com.sk.learn.dto;

public enum OrderStatusEnum {

    OrderPlaced("OrderPlaced"),
    OrderCreated("OrderCreated"),
    OrderFulfilled("OrderFulfilled");

    OrderStatusEnum(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    private final String orderStatus;

    public String getOrderStatus () {
        return orderStatus;
    }
}
