package demo;
import demo.dao.AddressDao;
import demo.entity.AddressEntity;

public class HibernateDemo {
	
	public static void main(String[] args) {
		
		AddressDao addressDao = new AddressDao();
		
		AddressEntity addressEntity = new AddressEntity();
		addressEntity.setCountry("Romania");
		addressEntity.setCity("Brasov");
		addressEntity.setStreat_name("Ioan Popasu");
		addressEntity.setStreat_number(2);
		addressEntity.setAppartment_number("50B");
		
		addressDao.saveAddressEntity(addressEntity);
		
		
		
	}

}
