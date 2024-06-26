package com.example.buildertwo.SupplyChain.Item;


import org.springframework.data.annotation.Id;

public class Item {


    @Id private String itemId;
    private String itemNumber;
    private String itemName;
    private int baseUnitPrice;
    private String baseUnitOfMeasure;

}
