package demo.dao;

import org.hibernate.Session;

import demo.entity.AddressEntity;
import demo.utils.HibernateUtil;

public class AddressDao {
	
	public static Session session = HibernateUtil.getSessionFactory().openSession();
	
	public void saveAddressEntity(AddressEntity address) {
		session.beginTransaction();
		
		session.save(address);
		session.getTransaction().commit();
		
	}

}
