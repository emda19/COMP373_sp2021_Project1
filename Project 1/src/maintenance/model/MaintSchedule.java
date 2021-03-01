package maintenance.model;
import java.util.Date;
import java.util.HashMap;

// Schedule of future maintenance requests
public class MaintSchedule {
    
	private String scheduleID;
    private MaintRequest maintRequest;
    private MaintCost cost;
    private Date scheduleDate;
    boolean completed;
    
    public MaintSchedule(String id, MaintRequest request, MaintCost cost, Date date) {
    	this.scheduleID = id;
    	this.maintRequest = request;
    	this.cost = cost;
    	this.scheduleDate = date;
    	this.completed = false;
    }
    
    //Get schedule ID
    public String getScheduleID() {
    	return this.scheduleID;
    }
    
    //Get request
    public MaintRequest getMaintRequest() {
    	return this.maintRequest;
    }
    
    //Get cost
    public MaintCost getMaintCost() {
    	return this.cost;
    }
    
    //Get schedule date
	public Date getScheduleDate() {
		return this.scheduleDate;
	}
	
	//Reschedule maintenance
	public void rescheduleMaint(Date d) {
		this.scheduleDate = d;
	}
	
	//Get status
	public boolean isCompleted() {
		return this.completed;
	}
	
	//Update status
	public void updateCompletionStatus(boolean b) {
		this.completed = b;
	}
}
