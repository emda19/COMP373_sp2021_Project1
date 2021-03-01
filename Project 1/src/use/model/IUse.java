package use.model;

import java.util.HashMap;

public interface IUse {

	public void setUseLogID(String id);
	public String getUseLogID();
	
	public void setUseLog(HashMap<UseInterval, FacilityUser> map);
	public HashMap<UseInterval, FacilityUser> getUseLog();
}
