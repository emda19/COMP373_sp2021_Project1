package facility.model;

import maintenance.model.FacilityMaintenance;
import use.model.FacilityUse;

public class Facility { //Apartment Building

	private String facilityID;
	
	private FacilityInfo info;
	private FacilityManager manager; //Landlord
	private FacilityCapacity capacity; //Number of units
	private FacilityMaintenance maintenance;
	private FacilityUse use;
	
	public Facility(String id, FacilityInfo info, FacilityManager manager, FacilityCapacity capacity,
			FacilityMaintenance maint, FacilityUse use) {
		this.facilityID = id;
		this.info = info;
		this.manager = manager;
		this.capacity = capacity;
		this.maintenance = maint;
		this.use = use;
	}
	
	//Get Facility ID
	public String getFacilityID() {
		return this.facilityID;
	}
	
	//Get Facility Info
	public FacilityInfo getFacilityInfo() {
		return this.info;
	}
			
	//Get FacilityManager
	public FacilityManager getFacilityManager() {
		return this.manager;
	}
	
	//Get FacilityCapacity
	public FacilityCapacity getFacilityCapacity() {
		return this.capacity;
	}
	
	//Get FacilityMaintenance
	public FacilityMaintenance getFacilityMaintenance() {
		return this.maintenance;
	}
	
	//Get FacilityUse
	public FacilityUse getFacilityUse() {
		return this.use;
	}
	
}
