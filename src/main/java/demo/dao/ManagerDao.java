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
		
		session.evict(manager);
	}
	
	public ManagerEntity getLatestManager() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("select m from ").append(ManagerEntity.class.getName()).append(" m order by m.id desc");
		
		ManagerEntity result = (ManagerEntity) session.createQuery(sb.toString()).setMaxResults(1).uniqueResult();
		
		return result;
	}

}
