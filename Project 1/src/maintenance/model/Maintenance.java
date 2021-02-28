package maintenance.model;
import java.util.*;

public class Maintenance {
    
	private int maintenanceCode;
    private String status = "resolving";
    private String maintenanceProblem;

    private MaintSchedule schedule;

    public MaintSchedule getSchedule() {
        return schedule;
    }
    public void setSchedule(MaintSchedule schedule) {
        this.schedule = schedule;
    }
    public MaintSchedule scheduleMaintenance(Date date) {
    	MaintSchedule s = new MaintSchedule(date);
        setSchedule(s);
        setStatus("Maintenance has been scheduled");
        return s;
    }
	  public int getMaintenanceCode() {
		  return maintenanceCode;
	}
	  public void setMaintenanceID(int maintenanceCode) {
		  this.maintenanceCode = maintenanceCode;
	}
  	public String getStatus() {
		  return status;
	}
	  public void setStatus(String status) {
		  this.status = status;
	}
	  public String getProblemDescription() {
		  return maintenanceProblem;
	}
	  public void setProblemDescription(String problemDescription) {
      this.maintenanceProblem = problemDescription;
	}

}

