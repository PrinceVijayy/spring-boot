package com.ojas.Simple_Eats.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "items", schema = "simple_eats")
public class Item {
	
	@Id
	private int itemId;
	private String itemName;
	private double itemPrice;
	private int itemQuantity;
	private String itemImage;

}
