package com.ojas.Simple_Eats.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.Simple_Eats.model.Item;
import com.ojas.Simple_Eats.repository.ItemRepository;

@Service
public class ItemService {

	@Autowired
	ItemRepository itemRepository;

	public List<Item> getAllItems() {
		return itemRepository.findAll();
	}
	public Item getItem(int id) {
		return itemRepository.findById(id).orElse(null);
	}
	public void createItem(Item item) {
		itemRepository.save(item);
	}
	public void updateItem(Item item) {
		Item existingItem=itemRepository.findById(item.getItemId()).orElse(null);
		if(existingItem!= null) {
			existingItem.setItemName(item.getItemName());
			existingItem.setItemImage(item.getItemImage());
			existingItem.setItemPrice(item.getItemPrice());
			existingItem.setItemQuantity(item.getItemQuantity());
		}
	}
	public void deleteItem(int id) {
		itemRepository.deleteById(id);
	}

}
