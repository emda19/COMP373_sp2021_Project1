package facility.model;

public class FacilityInfo implements IFacility {

	private String facilityID;
	private String name;
	private Address address;
	private FacilityManager manager;
	private FacilityCapacity capacity;
	
	public FacilityInfo() {
		setFacilityManager(new FacilityManager());
		setFacilityCapacity(new FacilityCapacity());
	}
	
	@Override
	public void setFacilityID(String id) {
		this.facilityID = id;
		
	}

	@Override
	public String getFacilityID() {
		return this.facilityID;
	}
	
	@Override
	public void setFacilityName(String name) {
		this.name = name;
	}
		
	@Override
	public String getFacilityName() {
		return this.name;
	}
	
	@Override
	public void setFacilityAddress(Address ad) {
		this.address = ad;
	}
		
	@Override
	public Address getFacilityAddress() {
		return this.address;
	}

	@Override
	public void setFacilityManager(FacilityManager manager) {
		this.manager = manager;
	}

	@Override
	public FacilityManager getFacilityManager() {
		return this.manager;
	}

	@Override
	public void setFacilityCapacity(FacilityCapacity capacity) {
		this.capacity = capacity;
	}

	@Override
	public FacilityCapacity getFacilityCapacity() {
		return this.capacity;
	}
	
	
	
	
}
