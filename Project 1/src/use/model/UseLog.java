package use.model;

import java.util.HashMap;

public class UseLog {
	
	private String useLogID;
	private HashMap<FacilityUser, UseInterval> useLog;
	
	public UseLog() {}
	
	//Get schedule ID
	public String getUseScheduleID() {
		return this.useLogID;
	}
	
	//Get use schedule
	public HashMap<FacilityUser, UseInterval> getUserSchedule() {
		return this.useLog;
	}
	
}
