package com.ojas.Simple_Eats.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.Simple_Eats.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{
	
	

}
