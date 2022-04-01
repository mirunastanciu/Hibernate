package demo.dto;

import org.apache.commons.lang3.StringUtils;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class EmployeeDto {

	private String firstName;
	private String lastName;
	private String country;
	private String city;
	private String managerName;
	
	public EmployeeDto(String firstName, String lastName, String country, String city, String managerFirstName, String managerLastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.city = city;
		this.managerName = StringUtils.join(managerFirstName," ",managerLastName);
	}
	
	
}
