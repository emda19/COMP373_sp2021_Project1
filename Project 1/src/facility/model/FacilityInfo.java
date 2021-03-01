package facility.model;

import java.util.Date;

public class FacilityInfo implements IFacility {

	private String facilityID;
	private String name;
	private Address address;
	private FacilityManager manager;
	private FacilityCapacity capacity;
	private Date openDate;
	
	public FacilityInfo() {
		setFacilityManager(new FacilityManager());
		setFacilityCapacity(new FacilityCapacity());
		setOpenDate(new Date());
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
	
	public String toString() {
		String id = "ID: " + this.facilityID;
		String name = "Building Name : " + this.name;
		String address = this.address.toString();
		String manager = this.manager.toString();
		return id + "\n" + name + "\n" + address + "\n" + manager;
	}

	@Override
	public void setOpenDate(Date d) {
		this.openDate = d;
	}

	@Override
	public Date getOpenDate() {
		return this.openDate;
	}
	
	
}
