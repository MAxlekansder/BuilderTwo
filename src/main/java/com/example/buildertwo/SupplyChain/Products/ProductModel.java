package com.example.buildertwo.SupplyChain.Products;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "Order")
public class ProductModel {

    @Id
    private String id;
    private String productName;

    private String unitOfMeasure;
    private int productAmount;
    private boolean isProductActive;

}
