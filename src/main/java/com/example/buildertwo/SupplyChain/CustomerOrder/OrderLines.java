package com.example.buildertwo.SupplyChain.CustomerOrder;


public class OrderLines {

    private int orderLine;
    private String itemName;
    private String itemNumber;
    private long quantity;
<<<<<<< HEAD
    private long salesPrice;
    private long netPrice;
    private int discount;
=======
    private double salesPrice;
    private double netPrice;
>>>>>>> master


    public OrderLines( int orderLine, String itemName, String itemNumber, long quantity, double salesPrice, double netPrice) {
        this.orderLine = orderLine;
        this.itemName = itemName;
        this.itemNumber = itemNumber;
        this.quantity = quantity;
        this.salesPrice = salesPrice;
        this.netPrice = netPrice;
    }

    public OrderLines() {

    }


    public int getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(int orderLine) {
        this.orderLine = orderLine;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }
}
