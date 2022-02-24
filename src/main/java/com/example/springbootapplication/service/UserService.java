package com.example.springbootapplication.service;

import com.example.springbootapplication.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<User> findById(long id);

    User findByName(String name);

    void saveUser(User user);

    boolean isUserExist(User user);

    List<User> findAllUsers();

    void deleteUserById(Long id);

    void deleteAllUsers();

    public void updateUser(User user);

}
