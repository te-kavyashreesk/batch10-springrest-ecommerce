package com.te.springresteitem.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import org.springframework.stereotype.Repository;
import com.te.springresteitem.bean.ItemInfoBean;
import com.te.springresteitem.exception.ItemException;
@Repository
public class ItemDAOImpl implements ItemDAO {
	
	@PersistenceUnit
	private EntityManagerFactory factory;

	
	@Override
	public boolean addItem(ItemInfoBean item) {
		
		try {
			//EntityManagerFactory factory = Persistence.createEntityManagerFactory("cart");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(item);
			transaction.commit();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}

	}


	@Override
	public ItemInfoBean getitemData(int id) {
		
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("springdb");
		EntityManager manager = factory.createEntityManager();
		ItemInfoBean bean = manager.find(ItemInfoBean.class,id);
		return bean;
	}
	
	@Override
	public boolean updateItem(ItemInfoBean infoBean) {
		
		try {
//			EntityManagerFactory factory = Persistence.createEntityManagerFactory("springdb");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			System.out.println("id "+infoBean.getId());
			ItemInfoBean orgData = manager.find(ItemInfoBean.class, infoBean.getId());

			if (infoBean.getName() != null && infoBean.getName() != "") {
				orgData.setName(infoBean.getName());
			}
		
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public boolean deleteItem(int id) {
			try {
//				EntityManagerFactory factory = Persistence.createEntityManagerFactory("springdb");
				EntityManager manager = factory.createEntityManager();
				EntityTransaction transaction = manager.getTransaction();
				transaction.begin();
				ItemInfoBean infoBean = manager.find(ItemInfoBean.class, id);
				manager.remove(infoBean);
				transaction.commit();
				return true;
			} catch (Exception e) {

				e.printStackTrace();

				throw new ItemException("The Data is not present");
			}
		}


	
}