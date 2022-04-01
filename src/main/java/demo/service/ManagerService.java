package demo.service;

import demo.dao.ManagerDao;
import demo.entity.ManagerEntity;

public class ManagerService {

	public static ManagerDao managerDao = new ManagerDao();
	
	public void addManager(String firstName, String lastName) {
		ManagerEntity manager = new ManagerEntity();
		manager.setFirstName(firstName);
		manager.setLastName(lastName);
		
		managerDao.saveManager(manager);
	}
}
