package maintenance.model;
import java.util.*;

public class Maintenance {
    private int maintenanceCode;
    private String status = "resolving";
    private String maintenanceProblem;

    private MaintenanceSchedule schedule;

    public MaintenanceSchedule getSchedule() {
        return schedule;
    }
    public void setSchedule(MaintenanceSchedule schedule) {
        this.schedule = schedule;
    }
    public MaintenanceSchedule scheduleMaintenance(Date date) {
    	MaintenanceSchedule s = new MaintenanceSchedule(date);
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

