package com.te.springresteitem.dao;

import com.te.springresteitem.bean.ItemInfoBean;


public interface ItemDAO {

	
	public ItemInfoBean getitemData(int id);

	public boolean addItem(ItemInfoBean infoBean);

	public boolean updateItem(ItemInfoBean infoBean);

	public boolean deleteItem(int id);
	
}



