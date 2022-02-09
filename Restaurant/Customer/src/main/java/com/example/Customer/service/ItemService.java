package com.example.Customer.service;

import com.example.Customer.model.Item;
import com.example.Customer.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    public Item getItem(String itemID) {
        return itemRepository.findById(itemID).orElse(null);
    }
}
