package com.example.shoppinglist.services;

import com.example.shoppinglist.persist.entities.ShoppingItem;
import com.example.shoppinglist.persist.entities.User;

import java.util.List;

public interface ShoppingItemService {
    List<ShoppingItem> findAll();
    List<ShoppingItem> findByUserUsername(String username);
    void save(ShoppingItem item);
    void deleteById(Long id);
}
