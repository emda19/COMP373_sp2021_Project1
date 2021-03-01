package facility.model;

import maintenance.model.MaintLog;
import use.model.UseLog;

public interface IFacility {

	public void setFacilityID(String id);
	public String getFacilityID();
	
	public void setFacilityInfo(FacilityInfo info);
	public FacilityInfo getFacilityInfo();
	
	public void setFacilityManager(FacilityManager manager);
	public FacilityManager getFacilityManager();
	
	public void setFacilityCapacity(FacilityCapacity capacity);
	public FacilityCapacity getFacilityCapacity();
	
	public void setMaintLog(MaintLog maintLog);
	public MaintLog getFacilityMaintLog();
	
	public void setUseLog(UseLog useLog);
	public UseLog getFacilityUseLog();
	
}
