package maintenance.model;
import java.util.Date;

public class MaintSchedule {
    private int scheduleNumber;
    private Date dateScheduled;
    private MaintenanceRequest service = new MaintenanceRequest();
    
    public MaintenanceSchedule(Date date) {
    	setDateScheduled(date);
    	setService(new MaintenanceRequest());
    }
	  public int getScheduleNumber() {
		  return scheduleNumber;
	}
	  public void setScheduleID(int scheduleID) {
		  this.scheduleNumber = scheduleID;
	}
	  public Date getDateScheduled() {
		  return dateScheduled;
	}
	  public void setDateScheduled(Date dateScheduled) {
		  this.dateScheduled = dateScheduled;
	}
	  public MaintenanceRequest getService() {
		  return service;
	}
	  public void setService(MaintenanceRequest service) {
		  this.service = service;
	} 
}


