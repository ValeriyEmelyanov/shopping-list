package com.example.shoppinglist.services;

import com.example.shoppinglist.persist.entities.ShoppingItem;
import com.example.shoppinglist.persist.repositories.ShoppingItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingItemServiceImpl implements ShoppingItemService {
    private ShoppingItemRepository repository;

    @Autowired
    public ShoppingItemServiceImpl(ShoppingItemRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ShoppingItem> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(ShoppingItem item) {
        repository.save(item);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
