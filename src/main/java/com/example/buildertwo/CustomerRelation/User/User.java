package com.example.buildertwo.CustomerRelation.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.Date;

@Document (collection = "User")
/*public record User(@MongoId String id, String name, LocalDate dateOfBirth, int telephoneNumber, String email, typeOfStatus status) {} */
public class User {

    @Id
    private String id;
    @NotNull private String name;
    private Date dateOfBirth;
    private String telephoneNumber;
    private String email;
    private typeOfStatus status;

    public User(String id, String name, Date dateOfBirth, String telephoneNumber, String email, typeOfStatus status) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}



