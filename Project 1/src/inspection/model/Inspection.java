package inspection.model;
import java.util.Date;

public class Inspection implements I_Inspection {
    
	private String inspectionID;
    private Date inspectionDate;
    private String inspectionDescription;
    private String outcome;
	
    public Inspection() {}
    
    @Override
	public void setInspectionID(String id) {
		this.inspectionID = id;
	}
    
	@Override
	public String getInspectionID() {
		return this.inspectionID;
	}
	
	@Override
	public void setInspectionDate(Date d) {
		this.inspectionDate = d;
	}
	
	@Override
	public Date getInspectionDate() {
		return this.inspectionDate;
	}
	
	@Override
	public void setInspectionDescription(String s) {
		this.inspectionDescription = s;
	}
	
	@Override
	public String getInspectionDescription() {
		return this.inspectionDescription;
	}
	
	@Override
	public void setInspectionOutcome(String s) {
		this.outcome = s;
	}
	
	@Override
	public String getInspectionOutcome() {
		return this.outcome;
	}
    
}

