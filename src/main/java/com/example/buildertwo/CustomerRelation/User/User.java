package com.example.buildertwo.CustomerRelation.User;
import com.example.buildertwo.EnumsCategories;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document (collection = "User")
public class User {

    @Id private String userId;
    @NotNull private String name;
    private String dateOfBirth; //optional
    private String telephoneNumber;
    private String email;
    @JsonEnumDefaultValue private EnumsCategories.userStatus userStatus;
    private boolean isActive;

    private final EnumsCategories.userStatus enumsCategories;


    public User(String userId, String name, String dateOfBirth, String telephoneNumber, String email, EnumsCategories.userStatus enumsCategories) {
        this.userId = userId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.enumsCategories = enumsCategories;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EnumsCategories.userStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(EnumsCategories.userStatus userStatus) {
        this.userStatus = userStatus;
    }
}



