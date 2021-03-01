package facility.model;

import maintenance.model.MaintLog;
import use.model.UseLog;

public class Facility implements IFacility { //Apartment Building

	private String facilityID;
	private FacilityInfo info;
	private FacilityManager manager; //Landlord
	private FacilityCapacity capacity; //Number of units
	private MaintLog maintLog;
	private UseLog useLog;
	
	public Facility() {
		new FacilityInfo();
		new FacilityManager();
		new FacilityCapacity();
		new MaintLog();
		new UseLog();
	}
	
	//Get Facility ID
	public String getFacilityID() {
		return this.facilityID;
	}
	
	//Set Facility ID
	public void setFacilityID(String id) {
		this.facilityID = id;
	}
	
	//Get Facility Info
	public FacilityInfo getFacilityInfo() {
		return this.info;
	}
	
	//Set Facility Info
	public void setFacilityInfo(FacilityInfo info) {
		this.info = info;
	}
			
	//Get Facility Manager
	public FacilityManager getFacilityManager() {
		return this.manager;
	}
	
	//Set Facility Manager
	public void setFacilityManager(FacilityManager manager) {
		this.manager = manager;
	}
	
	//Get Facility Capacity
	public FacilityCapacity getFacilityCapacity() {
		return this.capacity;
	}
	
	//Set Facility Capacity
	public void setFacilityCapacity(FacilityCapacity capacity) {
		this.capacity = capacity;
	}
	
	//Get Maint Log
	public MaintLog getFacilityMaintLog() {
		return this.maintLog;
	}
	
	//Set Maint Log
	public void setMaintLog(MaintLog maintLog) {
		this.maintLog = maintLog;
	}
	
	//Get Use Log
	public UseLog getFacilityUseLog() {
		return this.useLog;
	}
	
	//Set Use Log
	public void setUseLog(UseLog useLog) {
		this.useLog = useLog;
	}

}
