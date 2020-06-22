package com.sk.learn.resource;

import com.sk.learn.dto.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders/accounts/{accountId}")
public class OrderResource {

    @GetMapping
    public ResponseEntity<Order> getOrderDetails (@PathVariable String accountId) {
     return null;
    }

    @PostMapping
    public ResponseEntity<Order> createOrder (@PathVariable String accountId, @RequestBody Order order) {
      return null;
    }

}
