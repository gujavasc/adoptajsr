package com.ivanjunckes.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Order {
	private Integer id;
	private String name;
	private Float price;
	
	public Order(){
		
	}
	
	public Order(Integer id, String name, Float price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
