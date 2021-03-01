package maintenance.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

// Record of all maintenance orders
public class MaintLog {

	private String maintLogID;
	private ArrayList<MaintRequest> requestLog; //list of all maintenance requests
	private ArrayList<MaintSchedule> schedule; //list of all scheduled maintenance
	
	public MaintLog() {
		new ArrayList<MaintRequest>();
		new ArrayList<MaintSchedule>();
	}
	
	//Get maintenance log ID
	public String getLogID() {
		return this.maintLogID;
	}
	
	//Set maintenance log ID
	public void setLogID(String id) {
		this.maintLogID = id;
	}
	
	//Get request log
	public ArrayList<MaintRequest> getLog() {
		return this.requestLog;
	}
	
	//Set request log
	public void setRequestLog(ArrayList<MaintRequest> log) {
		this.requestLog = log;
	}
	
	//Get schedule
	public ArrayList<MaintSchedule> getSchedule() {
		return this.schedule;
	}
	
	//Set schedule
	public void setSchedule(ArrayList<MaintSchedule> schedule) {
		this.schedule = schedule;
	}
	
}
