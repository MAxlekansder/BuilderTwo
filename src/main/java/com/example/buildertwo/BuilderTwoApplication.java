package com.example.buildertwo;

import com.example.buildertwo.CustomerRelation.User.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BuilderTwoApplication {

    private final UserService userService;

    public BuilderTwoApplication(UserService userService) {
        this.userService = userService;
    }


    public static void main(String[] args) {

        SpringApplication.run(BuilderTwoApplication.class, args);

    }
}
