package use.model;

public class FacilityUser {

	private String renterID;
	private String firstName;
	private String lastName;
	
	public FacilityUser(String id, String first, String last) {
		this.renterID = id;
		this.firstName = first;
		this.lastName = last;
	}
	
	//Get Renter ID
	public String getRenterID() {
		return this.renterID;
	}
	
	//Get first name
	public String getFirstName() {
		return this.firstName;
	}
	
	//Get last name
	public String getLastName() {
		return this.lastName;
	}
	
}
