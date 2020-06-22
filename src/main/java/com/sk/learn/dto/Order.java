package com.sk.learn.dto;

import lombok.Data;

@Data
public class Order {

    private String accountId;
    private String orderId;
    private String orderModifiedTimeStamp;
    private String orderPlacedTimeStamp;
    private OrderStatusEnum orderStatus;

}
