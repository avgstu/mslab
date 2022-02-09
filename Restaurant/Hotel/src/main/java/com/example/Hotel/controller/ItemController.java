package com.example.Hotel.controller;

import com.example.Hotel.model.Item;
import com.example.Hotel.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/hotel")
@RestController
public class ItemController {
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/getAllItems")
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @GetMapping("/get/{itemID}")
    public Item getItem(@PathVariable String itemID) {
        return itemService.getItem(itemID);
    }

    @PostMapping("/createItem")
    public Item createItem(@RequestBody Item item) {
        return itemService.create(item);
    }

    @DeleteMapping("/deleteItem/{itemId}")
    public String deleteItem(@PathVariable String itemId) {
        itemService.delete(itemId);
        return "Item deleted";
    }

    @PutMapping("/updateItem/{itemId}")
    public String updateItem(@PathVariable String itemId) {
        return itemService.update(itemId);
    }

    @DeleteMapping("/deleteAll")
    public String deleteItems() {
        itemService.deleteAll();
        return "All items deleted";
    }
}
