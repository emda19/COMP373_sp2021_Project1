package maintenance.model;
import java.util.Date;
import java.util.HashMap;

// Schedule of future maintenance requests
public class MaintSchedule {
    
	private String scheduleID;
    private HashMap<Date, MaintOrder> schedule; //Date to be completed, Order to be completed
    
    public MaintSchedule(String id) {
    	this.scheduleID = id;
    	schedule = new HashMap<Date, MaintOrder>();
    }
    
    //Get schedule ID
	public String getScheduleID() {
		return this.scheduleID;
	}
	
	//Get schedule
	public HashMap<Date, MaintOrder> getSchedule() {
		return this.schedule;
	}
	
}
