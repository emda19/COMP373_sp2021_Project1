package maintenance.model;
import java.util.Date;

public class MaintSchedule {
    private int scheduleNumber;
    private Date dateScheduled;
    private MaintRequest service = new MaintRequest();
    
    public MaintSchedule(Date date) {
    	setDateScheduled(date);
    	setService(new MaintRequest());
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
	  public MaintRequest getService() {
		  return service;
	}
	  public void setService(MaintRequest service) {
		  this.service = service;
	} 
}


