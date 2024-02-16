package com.example.buildertwo.CustomerRelation.User;


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
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/saveUser")
    public User createUser(User user) {
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable String id) {
        Optional<User> optionalUser = userService.getUserById(id);

        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    /*

    @GetMapping("/getUsers")
    public List<User> getUsers() {
        return userRepository.findAll();

    }


    @PostMapping("/saveUser")
    public User createUser( User user) {
        return userRepository.save(user);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable String id) {
        Optional<User> optionalUser = userRepository.findById(id);

        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    } */
}
