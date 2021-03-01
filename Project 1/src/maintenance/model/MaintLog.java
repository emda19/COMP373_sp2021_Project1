package maintenance.model;

import java.util.Date;
import java.util.HashMap;

// Record of completed maintenance jobs
public class MaintLog {

	private String logID;
	private HashMap<Date, MaintOrder> log;
	
	public MaintLog(String id) {
		this.logID = id;
		this.log = new HashMap<Date, MaintOrder>();
	}
	
	//Get maintenance log ID
	public String getLogID() {
		return this.logID;
	}
	
	//Get maintenance log
	public HashMap<Date, MaintOrder> getLog() {
		return this.log;
	}
	
}
