package facility.model;

import java.util.ArrayList;

import maintenance.model.FacilityMaintenance;
import use.model.FacilityUse;

public interface Facility_Interface {

	public void setFacilityInfo(FacilityInfo info);
	public FacilityInfo getFacilityInfo();
	public void setFacilityManager(FacilityManager manager);
	public FacilityManager getFacilityManager();
	public void setFacilityCapacity(FacilityCapacity capacity);
	public FacilityCapacity getFacilityCapacity();
	public void setFacilityMaintenance(FacilityMaintenance maint);
	public FacilityMaintenance getFacilityMaintenance();
	public void setFacilityUse(FacilityUse use);
	public FacilityUse getFacilityUse();
	
}
