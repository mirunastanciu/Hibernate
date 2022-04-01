package demo.service;

import demo.dao.EmployeeDao;
import demo.entity.AddressEntity;
import demo.entity.EmployeeEntity;
import demo.entity.ManagerEntity;

public class EmployeeService {
	
	public static EmployeeDao employeeDao = new EmployeeDao();
	
	public void addEmployee(String firstName, String lastName, AddressEntity address, ManagerEntity manager) {
		
		EmployeeEntity employee = new EmployeeEntity();
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setAddress(address);
		employee.setManager(manager);
		
		employeeDao.saveEmployee(employee);
		
	}

}
