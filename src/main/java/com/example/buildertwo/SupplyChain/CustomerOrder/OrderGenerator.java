package com.example.buildertwo.SupplyChain.CustomerOrder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Order")
public class OrderGenerator {

    @Id
    private String OrderId;
    private OrderHead orderHead;
    private List<OrderLines> orderLines;


}
