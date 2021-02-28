package facility.model;

public class Facility { //Apartment Building

	private String facilityID;
	private FacilityInfo facilityInfo;
	
	public Facility(String id, FacilityInfo info) {
		this.facilityID = id;
		this.facilityInfo = info;
	}
	
	//Get Facility ID
	public String getFacilityID() {
		return this.facilityID;
	}
	
	//Get Facility ID
	public FacilityInfo getFacilityInfo() {
		return this.facilityInfo;
	}
	
}
