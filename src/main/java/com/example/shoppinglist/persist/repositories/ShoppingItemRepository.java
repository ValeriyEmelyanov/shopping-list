package com.example.shoppinglist.persist.repositories;

import com.example.shoppinglist.persist.entities.ShoppingItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingItemRepository extends JpaRepository<ShoppingItem, Long> {
}
