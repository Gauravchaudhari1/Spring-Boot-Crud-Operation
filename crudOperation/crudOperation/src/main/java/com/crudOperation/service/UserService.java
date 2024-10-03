package com.crudOperation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudOperation.entity.User;
import com.crudOperation.repo.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public List<User> getAllUser() {

        return userRepo.findAll();

    }

    public User getUserById(Long id) {

        return userRepo.findById(id).orElseThrow();

    }

    // public User saveUser() {
    // User user = new User();

    // return userRepo.save(user);
    // }

    // ? <<<<------------------ OR ------------------->>>>

    public User saveUser(User user) {
        return userRepo.save(user);
    }

    public User updateUser(Long id, User userDetails) {

        User user = userRepo.findById(id).orElse(null);

        if (user != null) {

            user.setName(userDetails.getName());
            user.setEmail(userDetails.getEmail());

        }

        return userRepo.save(user);

    }

    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }
}
