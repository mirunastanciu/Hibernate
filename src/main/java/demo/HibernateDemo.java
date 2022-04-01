package demo;
import java.util.List;

import demo.dao.AddressDao;
import demo.dao.EmployeeDao;
import demo.dao.ManagerDao;
import demo.dto.EmployeeDto;
import demo.service.AddressService;
import demo.service.EmployeeService;
import demo.service.ManagerService;

public class HibernateDemo {
	
	public static void main(String[] args) {
		
		AddressService addressService = new AddressService();
		ManagerService managerService = new ManagerService();
		EmployeeService employeeService = new EmployeeService();
		
//		addressService.addAddress("Romania", "Brasov", "Ioan Popasu", 4, "44");
//		managerService.addManager("Ion", "Popescu");
//		
		ManagerDao managerDao = new ManagerDao();
		AddressDao addressDao = new AddressDao();
		EmployeeDao employeeDao = new EmployeeDao();
		
//		employeeService.addEmployee("Miruna", "Stanciu", addressDao.getLatestAddress(), managerDao.getLatestManager());
		
		System.out.println("Employee = " + employeeDao.getEmployeeById(4));
		
		
		addressService.addAddress("Romania", "Cluj", "Vasile Alexandri", 9, "85");
		managerService.addManager("Alex", "Pop");
		employeeService.addEmployee("Ana", "Popescu", addressDao.getLatestAddress(), managerDao.getLatestManager());
		
		List<EmployeeDto> employeeList = employeeDao.getEmployeeList();
		
		employeeList.stream().forEach(e -> System.out.println("Employee dto = " + e));
		
		
		
		
	}

}
