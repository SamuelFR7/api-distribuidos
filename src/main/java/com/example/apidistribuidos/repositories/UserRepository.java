package com.example.apidistribuidos.repositories;

import com.example.apidistribuidos.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<User> getAllUsers();
    Optional<User> getUserById(String id);
    User createUser(User user);
    User updateUser(String id, User user);
    void deleteUser(String id);
}
