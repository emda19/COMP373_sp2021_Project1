package facility.model;

public class FacilityInfo {

	private String facilityID;
	private String name;
	private Address address;
	private FacilityManager manager;
	private FacilityCapacity capacity;
	
	public FacilityInfo() {}
	
	//Set Facility ID
	public void setFacilityID(String id) {
		this.facilityID = id;
	}
	
	//Get Facility ID
	public String getFacilityID() {
		return this.facilityID;
	}
	
	//Set Name
	public void setFacilityName(String name) {
		this.name = name;
	}
		
	//Get Name
	public String getFacilityName() {
		return this.name;
	}
	
	//Set Address
	public void setFacilityAddress(Address ad) {
		this.address = ad;
	}
		
	//Get Address
	public Address getFacilityAddress() {
		return this.address;
	}
	
	//Set FacilityManager
	public void setFacilityManager(FacilityManager fm) {
		this.manager = fm;
	}
		
	//Get FacilityManager
	public FacilityManager getFacilityManager() {
		return this.manager;
	}
	
	//Set FacilityCapacity
	public void setFacilityCapacity(FacilityCapacity fc) {
		this.capacity = fc;
	}
	
	//Get FacilityCapacity
	public FacilityCapacity getFacilityCapacity() {
		return this.capacity;
	}
	
	
}
