package com.example.shoppinglist.services;

import com.example.shoppinglist.persist.entities.ShoppingItem;

import java.util.List;

public interface ShoppingItemService {
    List<ShoppingItem> findAll();
    void save(ShoppingItem item);
    void deleteById(Long id);
}
