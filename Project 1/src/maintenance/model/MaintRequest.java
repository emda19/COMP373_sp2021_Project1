package maintenance.model;
import java.util.Date;

public class MaintRequest {
      private int requestNumber;
	    private Date dateRequested;
	    private String requestDescription;
	    
	    private Maintenance maintenance;
	    public MaintenanceRequest() {
	    	setMaintenance(new Maintenance());
	    }
		  public int getRequestID() {
			  return requestNumber;
		}
		  public void setRequestID(int requestID) {
			  this.requestNumber = requestID;
		}
		  public Date getDateRequested() {
			  return dateRequested;
		}
		  public void setDateRequested(Date dateRequested) {
			  this.dateRequested = dateRequested;
		}
		public String getrequestDescription() {
			return requestDescription;
		}
	  	public void setTextDescription(String requestDescription) {
			  this.requestDescription = requestDescription;
		}
	  	public Maintenance getMaintenance() {
			  return maintenance;
		}
		  public void setMaintenance(Maintenance maintanence) {
		  	this.maintenance = maintanence;
		}
	}


