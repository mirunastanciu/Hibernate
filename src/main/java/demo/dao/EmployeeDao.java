package demo.dao;

import java.util.List;

import org.hibernate.Session;

import demo.dto.EmployeeDto;
import demo.entity.AddressEntity;
import demo.entity.EmployeeEntity;
import demo.entity.ManagerEntity;
import demo.utils.HibernateUtil;

public class EmployeeDao {
	
	public static Session session = HibernateUtil.getSessionFactory().openSession();
	
	public void saveEmployee(EmployeeEntity employee) {
		session.beginTransaction();
		session.save(employee);
		
		session.getTransaction().commit();
	}
	
	public EmployeeEntity getEmployeeById(int employeeId) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(" select e from ").append(EmployeeEntity.class.getName()).append(" e where e.id = :employeeId ");
		EmployeeEntity result = (EmployeeEntity) session.createQuery(sb.toString()).setParameter("employeeId", employeeId).uniqueResult();
		 
		return result;
		
	}
	
	public List<EmployeeDto> getEmployeeList(){
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("select new demo.dto.EmployeeDto(e.firstName, e.lastName, a.country, a.city, m.firstName, m.lastName) ")
        .append(" from ")
        .append(EmployeeEntity.class.getName()).append(" e, ")
		.append(ManagerEntity.class.getName()).append(" m, ")
		.append(AddressEntity.class.getName()).append(" a ")
		.append(" where ")
		.append(" e.manager.id = m.id ")
		.append(" and e.address.id = a.id ");
		
		return session.createQuery(sb.toString()).list();
		
	}

}
