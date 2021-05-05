package com.te.springresteitem.bean;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("response")
@JsonPropertyOrder({"status" , "msg"})
@XmlRootElement(name = "response")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemResponse implements Serializable{

	@JsonProperty("status")
	@XmlElement(name = "status-code")
	private int statusCode;
	
	
	private String  msg;
	
	@JsonProperty("item_info")
	@XmlElement(name = "item-info")
	private ItemInfoBean bean;
	
	
	private List<ItemInfoBean> ItemInfos;


	public int getStatusCode() {
		return statusCode;
	}


	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public ItemInfoBean getBean() {
		return bean;
	}


	public void setBean(ItemInfoBean bean) {
		this.bean = bean;
	}


	public List<ItemInfoBean> getItemInfos() {
		return ItemInfos;
	}


	public void setItemInfos(List<ItemInfoBean> itemInfos) {
		ItemInfos = itemInfos;
	}


	@Override
	public String toString() {
		return "ItemResponse [statusCode=" + statusCode + ", msg=" + msg + ", bean=" + bean + ", ItemInfos=" + ItemInfos
				+ "]";
	}
	
}