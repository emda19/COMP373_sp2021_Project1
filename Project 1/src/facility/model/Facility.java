package facility.model;

import java.util.ArrayList;

import inspection.model.I_Inspection;
import inspection.model.Inspection;
import maintenance.model.IMaintenance;
import maintenance.model.MaintLog;
import use.model.IUse;
import use.model.UseLog;

public class Facility {

	private IFacility facility;
	private IMaintenance maint;
	private IUse use;
	private I_Inspection inspection;
	
	public Facility() {
		this.facility = new FacilityInfo();
		this.maint = new MaintLog();
		this.use = new UseLog();
		this.inspection = new Inspection();
	}
	
}
