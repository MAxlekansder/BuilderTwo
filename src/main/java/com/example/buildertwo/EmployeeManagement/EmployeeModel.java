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
    private String password;
    private Date dateOfBirth;
    private String email;
    private String telephoneNumber;
    private EnumsCategories.employeeStatus employeeStatus;


    public EmployeeModel(String employeeId, String name, String password, Date dateOfBirth, String email, String telephoneNumber) {
        this.employeeId = employeeId;
        this.name = name;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
    }

    public EmployeeModel(){}


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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
