package com.example.buildertwo.SupplyChain.CustomerOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private MongoTemplate mongoTemplate;


    public void saveOrder(OrderGenerator orderGenerator) {
        mongoTemplate.save(orderGenerator);
    }
}
