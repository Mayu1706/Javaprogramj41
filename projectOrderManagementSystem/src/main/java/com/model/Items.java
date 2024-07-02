package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Items {
	@Id
	private int itemsid;
	private String description;
	private int price;
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Items(int itemsid, String description, int price) {
		super();
		this.itemsid = itemsid;
		this.description = description;
		this.price = price;
	}
	public int getItemsid() {
		return itemsid;
	}
	public void setItemsid(int itemsid) {
		this.itemsid = itemsid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	

}
