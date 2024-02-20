package com.example.buildertwo.SupplyChain.CustomerOrder;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/getOrders")
    public List<OrderHead> getOrders() {
        return orderService.getAllOrders();
    }



    @PostMapping("/createOrder")
    public OrderHead createUser(@RequestBody OrderHead orderHead) {

        return orderService.createOrder(orderHead);
    }
}
