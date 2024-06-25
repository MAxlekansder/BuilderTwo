package com.example.buildertwo.CustomerRelation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "/user")
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;


    @Autowired
    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }


    @GetMapping("/getUsers")
    public List<UserModel> getUsers() {
        return userService.getAllUsers();
    }


    @PostMapping("/createUser")
    public UserModel createUser(UserModel userModel) {
        return userService.createUser(userModel);
    }


    @GetMapping("/{userId}")
    public ResponseEntity<UserModel> getUserById(@PathVariable String userId) {
        Optional<UserModel> optionalUser = userService.getUserById(userId);

        if (optionalUser.isPresent()) {
            UserModel userModel = optionalUser.get();
            return ResponseEntity.ok(userModel);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
