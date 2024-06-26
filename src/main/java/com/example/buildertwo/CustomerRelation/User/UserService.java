package com.example.buildertwo.CustomerRelation.User;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    public UserModel createUser(UserModel userModel) {
        return userRepository.save(userModel);
    }

    public Optional<UserModel> getUserById(String id) {
        return userRepository.findById(id);
    }

}
