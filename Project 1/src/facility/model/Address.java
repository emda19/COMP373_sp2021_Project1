package facility.model;

public class Address {

	private String street;
	private String unit;
	private String city;
	private String state;
	private String zipcode;
	
	public Address(String street, String unit, String city, String state, String zipcode) {
		this.street = street;
		this.unit = unit;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
}
