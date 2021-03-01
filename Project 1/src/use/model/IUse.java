package use.model;

import java.util.ArrayList;

public interface IUse {

	public void setUseLogID(String id);
	public String getUseLogID();
	
	public void setUseLog(ArrayList<UseSchedule> list);
	public ArrayList<UseSchedule> getUseLog();
}
