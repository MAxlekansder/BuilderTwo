package com.example.buildertwo.SupplyChain.CustomerOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void saveOrder(OrderGenerator orderGenerator) {
        orderRepository.save(orderGenerator);
    }
}
