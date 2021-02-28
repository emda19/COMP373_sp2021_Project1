package use.model;

import facility.model.FacilityInfo;

public class FacilityUser {

	private String renterID;
	private String firstName;
	private String lastName;
	private FacilityInfo facility;
	private UseInterval leaseLength;
	
	public FacilityUser(String id, String first, String last, FacilityInfo f, UseInterval i) {
		this.renterID = id;
		this.firstName = first;
		this.lastName = last;
		this.facility = f;
		this.leaseLength = i;
	}
}
