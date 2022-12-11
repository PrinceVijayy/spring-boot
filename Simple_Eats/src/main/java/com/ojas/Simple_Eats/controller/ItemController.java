package com.ojas.Simple_Eats.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.Simple_Eats.model.Item;
import com.ojas.Simple_Eats.service.ItemService;

@RestController
public class ItemController {

	@Autowired
	ItemService itemService;

	@GetMapping("/items")
	public List<Item> getAllItems() {
		return itemService.getAllItems();
	}

	@GetMapping("/items/{id}")
	public Item getItem(@PathVariable int id) {
		return itemService.getItem(id);
	}

	@PostMapping("/items")
	public void createItem(@RequestBody Item item) {
		itemService.createItem(item);
	}

	@PutMapping("/items")
	public void updateItem(@RequestBody Item item) {
		itemService.updateItem(item);
	}

	@DeleteMapping("/items/{id}")
	public void deleteItem(@PathVariable int id) {
		itemService.deleteItem(id);
	}

}
