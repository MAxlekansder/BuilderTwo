package com.example.buildertwo.SupplyChain.CustomerOrder;
import com.example.buildertwo.EnumsCategories;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.mongodb.lang.Nullable;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;
import java.util.List;


@Setter
@Getter
@Document (collection = "Order")
public class OrderHead {

    @Id
    private String orderId;
    private String customerNumber;
    private String orderDate;
    private LocalDateTime registrationDate;
    @JsonEnumDefaultValue private EnumsCategories.orderType orderType;
    @Nullable private int orderStatus;
    @Nullable private double totalAmount;
    @Nullable private long totalVolume;
    @Nullable private List<OrderLines> orderLinesList;


    public OrderHead(String customerNumber, String orderDate, EnumsCategories.orderType orderType, int orderStatus, double totalAmount, long totalVolume) {
        this.customerNumber = customerNumber;
        this.orderDate = orderDate;
        this.registrationDate = LocalDateTime.now();
        this.orderType = orderType;
        this.orderStatus = orderStatus;
        this.totalAmount = totalAmount;
        this.totalVolume = totalVolume;

    }

}
