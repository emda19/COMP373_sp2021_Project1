package maintenance.model;

import java.util.ArrayList;

public interface IMaintenance {

	public void setMaintLogID(String id);
	public String getMaintLogID();
	
	public void setRequestLog(ArrayList<MaintRequest> list);
	public ArrayList<MaintRequest> getRequestLog();
	
	public void setSchedule(ArrayList<MaintSchedule> list);
	public ArrayList<MaintSchedule> getSchedule();
	
}
