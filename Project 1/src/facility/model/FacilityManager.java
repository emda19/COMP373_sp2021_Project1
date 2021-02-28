package facility.model;

public class FacilityManager {

	private String managerID;
	private String firstName;
	private String lastName;
	private Phone phoneNumber;
	
	public FacilityManager(String id, String first, String last, Phone pn) {
		this.managerID = id;
		this.firstName = first;
		this.lastName = last;
		this.phoneNumber = pn;
	}
	
	//Get Manager ID
	public String getManagerID() {
		return this.managerID;
	}
	
	//Get first name
	public String getFirstName() {
		return this.firstName;
	}
	
	//Get last name
	public String getLastName() {
		return this.lastName;
	}
	
	//Get phone number
	public Phone getPhoneNumber() {
		return this.phoneNumber;
	}
}
