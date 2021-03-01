package facility.model;

public class FacilityInfo {

	private String name;
	private Address address;
	
	public FacilityInfo() {}
	
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
	
	
	
	
}
