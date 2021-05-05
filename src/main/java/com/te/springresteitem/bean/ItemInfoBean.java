package com.te.springresteitem.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;



@Data
@Entity
@Table(name = "item")
@XmlRootElement(name = "item-info")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName("item_info")
public class ItemInfoBean implements Serializable {

	@Id
	@Column
	private int id;
	
	@Column
	private String name;
	
	@Column
	private int quantity;
	
	@Column
	private int price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ItemInfoBean [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	



}