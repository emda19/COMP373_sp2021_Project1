package use.model;

import facility.model.Facility;

public class FacilityUser {

	private String renterID;
	private String firstName;
	private String lastName;
	private Facility facility;
	private UseInterval useInterval;
	
	public FacilityUser(String id, String first, String last, Facility f, UseInterval ui) {
		this.renterID = id;
		this.firstName = first;
		this.lastName = last;
		this.facility = f;
		this.useInterval = ui;
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
	
	//Get facility
	public Facility getFacility() {
		return this.facility;
	}
	
	//Get use interval
	public UseInterval getUseInterval() {
		return this.useInterval;
	}
}
