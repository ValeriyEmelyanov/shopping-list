package com.example.shoppinglist.services;

import com.example.shoppinglist.dto.UserRepr;
import com.example.shoppinglist.persist.entities.User;
import com.example.shoppinglist.persist.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository repository, BCryptPasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void create(UserRepr userRepr) {
        User user = new User();
        user.setUsername(userRepr.getUsername());
        user.setPassword(passwordEncoder.encode(userRepr.getPassword()));
        repository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return repository.findByUsername(username).orElseThrow(IllegalArgumentException::new);
    }
}
