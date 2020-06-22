package com.sk.learn.resource;

import com.sk.learn.dto.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders/manage/accounts/{accountId}")
public class OrderManageResource {

    @GetMapping
    public ResponseEntity<Order> getSubmittedOrderDetails (@PathVariable String accountId) {
      return null;
    }

    @PostMapping
    public ResponseEntity<Order> submitOrder (@PathVariable String accountId, @RequestBody Order order) {
      return null;
    }
}
