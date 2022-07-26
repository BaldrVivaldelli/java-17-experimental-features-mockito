package com.example.java17.services;

import com.example.java17.model.Item;
import com.example.java17.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository repository;

    public Item retriveEspecificItem(String key){
        return repository.getReferenceById(key);
    }


    public List<Item> retrieveAllItems() {
        List<Item> items = repository.findAll();

        for(Item item:items) {
            item.setValue(item.getPrice() * item.getQuantity());
        }

        return items;
    }

    public Item retreiveHardcodedItem() {
        return new Item(1, "Ball", 10, 100);
    }
}
