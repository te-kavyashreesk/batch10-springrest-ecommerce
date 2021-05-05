package com.te.springresteitem.service;
import com.te.springresteitem.bean.ItemInfoBean;

public interface ItemService {


	public ItemInfoBean getitemData(int id);

	public boolean addItem(ItemInfoBean infoBean);

	public boolean updateItem(ItemInfoBean infoBean);

	public boolean deleteItem(int id);

}