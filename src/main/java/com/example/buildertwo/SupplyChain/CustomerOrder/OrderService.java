package com.example.buildertwo.SupplyChain.CustomerOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;


@Service
public class OrderService {


    @Autowired
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {this.orderRepository = orderRepository;}

    public List<OrderHead> getAllOrders() {return orderRepository.findAll();}

    public OrderHead createOrder(OrderHead orderHead) {return orderRepository.save(orderHead);}

}
