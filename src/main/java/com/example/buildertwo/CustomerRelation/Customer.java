package com.example.buildertwo.CustomerRelation;


import com.example.buildertwo.EnumsCategories;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Customer")
public class Customer {


    @Id
    private String customerId;
    private String customerNumber;
    private String customerName;
    @JsonEnumDefaultValue private EnumsCategories.userStatus userStatus;
    private int customerStatus;
    private boolean isActive;

    //private
}
