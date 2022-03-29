package demo.dao;

import org.hibernate.Session;

import demo.entity.EmployeeEntity;
import demo.utils.HibernateUtil;

public class EmployeeDao {
	
	public static Session session = HibernateUtil.getSessionFactory().openSession();
	
	public void saveEmployee(EmployeeEntity employee) {
		session.beginTransaction();
		session.save(employee);
		
		session.getTransaction().commit();
	}

}
