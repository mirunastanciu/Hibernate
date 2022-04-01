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
		
		session.evict(address);
		
	}
	
	public AddressEntity getLatestAddress() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(" select a from ").append(AddressEntity.class.getName()).append(" a order by a.id desc");
		
		AddressEntity result = (AddressEntity) session.createQuery(sb.toString()).setMaxResults(1).uniqueResult();
		
		return result;
		
	}

}
