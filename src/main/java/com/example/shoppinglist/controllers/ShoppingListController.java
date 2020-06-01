package com.example.shoppinglist.controllers;

import com.example.shoppinglist.persist.entities.ShoppingItem;
import com.example.shoppinglist.services.ShoppingItemService;
import com.example.shoppinglist.services.ShoppingItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ShoppingListController {
    private ShoppingItemService service;

    @Autowired
    public ShoppingListController(ShoppingItemServiceImpl service) {
        this.service = service;
    }

    @GetMapping
    public String indexPage(Model model) {
        model.addAttribute("items", service.findAll());
        model.addAttribute("item", new ShoppingItem());
        return "index";
    }

    @PostMapping
    public String newShoppingItem(ShoppingItem item) {
        service.save(item);
        return "redirect:/";
    }

    @DeleteMapping("/{id}")
    public String deleteShoppingItem(@PathVariable("id") Long id) {
        service.deleteById(id);
        return "redirect:/";
    }
}
