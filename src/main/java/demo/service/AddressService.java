package demo.service;

import demo.dao.AddressDao;
import demo.entity.AddressEntity;

public class AddressService {
	
	public static AddressDao addressDao = new AddressDao();
	
	public void addAddress(String country, String city, String streetName, int streetNumber, String appartment_number) {
		
		AddressEntity address = new AddressEntity();
		address.setCountry(country);
		address.setCity(city);
		address.setStreat_name(streetName);
		address.setStreat_number(streetNumber);
		address.setAppartment_number(appartment_number);
		
		addressDao.saveAddressEntity(address);
		
	}

}
