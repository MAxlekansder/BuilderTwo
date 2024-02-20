package com.example.buildertwo;


//potential enum-file for order type
public class EnumsCategories {
    public enum userStatus {
        REGULAR,
        USER,
        SUPERUSER,
        CAMPAIGNCUSTOMER,
        SPECIALCUSTOMER,
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
        CUSTOMERORDER,
        BULKORDER,
        EXTERNALORDER,
        MANIFACTURINGORDER,
        DIRECTORDER,
        DELIVERYORDER,
        DISTRIBUTIONORDER,
        PURCHASEORDER,
        INVOICEORDER
    }
}
