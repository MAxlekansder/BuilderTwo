package com.example.buildertwo.SupplyChain.Products;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "Order")
public class ProductModel {

    @Id
    private String id;


}
