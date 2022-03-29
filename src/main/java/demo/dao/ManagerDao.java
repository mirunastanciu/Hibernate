package demo.dao;

import org.hibernate.Session;

import demo.entity.ManagerEntity;
import demo.utils.HibernateUtil;

public class ManagerDao {
	
	public static Session session = HibernateUtil.getSessionFactory().openSession();
	
	public void saveManager(ManagerEntity manager) {
		session.beginTransaction();
		session.save(manager);
		
		session.getTransaction().commit();
	}

}
