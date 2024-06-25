package com.example.buildertwo.SupplyChain.CustomerOrder;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepository extends MongoRepository<OrderGenerator, String> {
}
