package com.example.springbootproductseller.service;

import com.example.springbootproductseller.model.Role;
import com.example.springbootproductseller.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    @Transactional
    void changeRole(Role newRole, String username);
}
