package facility.model;

import java.util.Date;

public interface IFacility {

	// Facility ID
	public void setFacilityID(String id);
	public String getFacilityID();
	
	// Facility Name
	public void setFacilityName(String s);
	public String getFacilityName();
	
	// Facility Address
	public void setFacilityAddress(Address a);
	public Address getFacilityAddress();
	
	// Facility Manager
	public void setFacilityManager(FacilityManager manager);
	public FacilityManager getFacilityManager();
	
	// Facility Capacity
	public void setFacilityCapacity(FacilityCapacity capacity);
	public FacilityCapacity getFacilityCapacity();
	
	//Date Opened
	public void setOpenDate(Date d);
	public Date getOpenDate();
	
}
