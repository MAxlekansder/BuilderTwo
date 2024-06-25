package com.example.buildertwo.EmployeeManagement;
import com.example.buildertwo.EnumsCategories;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document (collection = "EmployeeModel")
public class EmployeeModel {

    @Id
    private String employeeId;
    private String name;
    private Date dateOfBirth;
    private String email;
    private String telephoneNumber;
    private EnumsCategories.employeeStatus employeeStatus;


    private final EnumsCategories.employeeStatus enumsCategories;


    public EmployeeModel(String employeeId, String name, Date dateOfBirth, String email, String telephoneNumber, EnumsCategories.employeeStatus enumsCategories) {
        this.employeeId = employeeId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.enumsCategories = enumsCategories;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public EnumsCategories.employeeStatus getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(EnumsCategories.employeeStatus employeeStatus) {
        this.employeeStatus = employeeStatus;
    }
}
