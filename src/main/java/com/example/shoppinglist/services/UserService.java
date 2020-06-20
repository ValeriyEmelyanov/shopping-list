package com.example.shoppinglist.services;

import com.example.shoppinglist.dto.UserRepr;
import com.example.shoppinglist.persist.entities.User;

public interface UserService {
    void create(UserRepr userRepr);
    User findByUsername(String username);
}
