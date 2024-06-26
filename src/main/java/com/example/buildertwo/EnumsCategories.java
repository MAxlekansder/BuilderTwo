package com.example.buildertwo;


//potential enum-file for order type
public class EnumsCategories {
    public enum userStatus {
        REGULAR,
        USER,
        SUPERUSER,
        CAMPAIGNCUSTOMER,
        SPECIALCUSTOMER,
        BULKCUSTOMER,
    }

    public enum employeeStatus {
        TRAINEE,
        SALESREPRESENTATIVE,
        MANAGER,
        PROJECTMANAGER,
        COORDINATOR,
        ACCOUNTAT,
        LOGISTICALCOORDINATOR,
        ANALYST
    }

    public enum orderType {
        CUSTOMER_ORDER,
        BULK_ORDER,
        EXTERNAL_ORDER,
        MANIFACTURING_ORDER,
        DIRECT_ORDER,
        DELIVERY_ORDER,
        DISTRIBUTION_ORDER,
        PURCHASE_ORDER,
        INVOICE_ORDER
    }

    public enum customerType {
        BULK_CUSTOMER
    }
}
