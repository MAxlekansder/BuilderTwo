package com.example.buildertwo.CustomerRelation.Customer;


import com.example.buildertwo.EnumsCategories;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.mongodb.lang.Nullable;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "Customer")
public class Customer {

    @Id
    private String customerId;
    private int customerNumber;
    private String customerName;
    @JsonEnumDefaultValue
    private EnumsCategories.customerType customerType;
    private int customerStatus;
    private boolean isActive;
    @Nullable
    private long organisationNumber;

    public Customer(String customerName, EnumsCategories.customerType customerType, int customerStatus, boolean isActive, long organisationNumber) {
        this.customerNumber = customerNumberGenerator(customerType);
        this.customerName = customerName;
        this.customerType = customerType;
        this.customerStatus = customerStatus;
        this.isActive = isActive;
        this.organisationNumber = organisationNumber;
    }

    public int customerNumberGenerator(EnumsCategories.customerType customerType) {
        int newCustomerNumber = 1;
        return newCustomerNumber;
    }
}
