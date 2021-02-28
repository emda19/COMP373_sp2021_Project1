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
}
