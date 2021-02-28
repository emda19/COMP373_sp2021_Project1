package maintenance.model;
import java.util.Date;

public class Inspection {
	  private int inspectionNumber;
    private Date inspectionDate;
    private String inspectorInfo;
    private String results;
    
	  public int getInspectionNumber() {
		  return inspectionNumber;
	}
	  public void setInspectionID(int inspectionNumber) {
		  this.inspectionNumber = inspectionNumber;
	}
  	public Date getInspectionDate() {
		  return inspectionDate;
	}
	  public void setInspectionDate(Date inspectionDate) {
		  this.inspectionDate = inspectionDate;
	}
  	public String getInspectorInfo() {
		  return inspectorInfo;
	}
	  public void setInspector(String inspectorInfo) {
		  this.inspectorInfo = inspectorInfo;
	}
	  public String getResults() {
		  return results;
	}
	  public void setOutcome(String results) {
		  this.results = results;
	}
}

