package HAR_ONE_ONE_ASSOCIATION;

public class Address {

	private String doorNo;
	private String street;
	private String city;
	
	// inserting primitive values through constructor injection in Dependant Object 
	public Address(String doorNo, String street, String city) {
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
	}

	
	public String getDoorNo() {
		return doorNo;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}
	
	
	
	
}
