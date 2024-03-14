package com.example.apidistribuidos.repositories;
import com.example.apidistribuidos.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class InMemoryUserRepository implements UserRepository {
    private final Map<String, User> userMap = new HashMap<>();

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(userMap.values());
    }

    @Override
    public Optional<User> getUserById(String id) {
        return Optional.ofNullable(userMap.get(id));
    }

    @Override
    public User createUser(User user) {
        userMap.put(user.getId(), user);
        return user;
    }

    @Override
    public User updateUser(String id, User user) {
        if (!userMap.containsKey(id)) {
            throw new IllegalArgumentException("User not found with id: " + id);
        }
        user.setId(id);
        userMap.put(id, user);
        return user;
    }

    @Override
    public void deleteUser(String id) {
        userMap.remove(id);
    }
}
