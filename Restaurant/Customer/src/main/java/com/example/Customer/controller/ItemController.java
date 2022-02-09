package com.example.Customer.controller;

import com.example.Customer.model.Item;
import com.example.Customer.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/customer")
@RestController
public class ItemController {
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/get/{itemID}")
    public Item getItem(@PathVariable String itemID) {
        return itemService.getItem(itemID);
    }
}
