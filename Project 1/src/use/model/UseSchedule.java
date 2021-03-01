package use.model;

import java.util.HashMap;

public class UseSchedule {
	
	private String scheduleID;
	private HashMap<FacilityUser, UseInterval> schedule;
	
	public UseSchedule(String scheduleID) {
		this.scheduleID = scheduleID;
		this.schedule = new HashMap<FacilityUser, UseInterval>();
	}
	
	//Get schedule ID
	public String getUseScheduleID() {
		return this.scheduleID;
	}
	
	//Get use schedule
	public HashMap<FacilityUser, UseInterval> getUserSchedule() {
		return this.schedule;
	}
	
}
