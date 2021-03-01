package inspection.model;

import java.util.ArrayList;

public class InspectionLog implements I_Inspection {

	private ArrayList<Inspection> inspectionLog;
	
	public InspectionLog() {
		this.inspectionLog = new ArrayList<Inspection>();
	}

	@Override
	public void setInspectionLog(ArrayList<Inspection> list) {
		this.inspectionLog = list;
	}

	@Override
	public ArrayList<Inspection> getInspectionLog() {
		return this.inspectionLog;
	}

}
