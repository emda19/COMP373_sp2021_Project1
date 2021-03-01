package use.model;

import java.util.HashMap;

public class UseLog implements IUse {
	
	private String useLogID;
	private HashMap<UseInterval, FacilityUser> useLog;
	
	public UseLog() {
		this.useLog = new HashMap<UseInterval, FacilityUser>();
	}

	@Override
	public void setUseLogID(String id) {
		this.useLogID = id;
	}

	@Override
	public String getUseLogID() {
		return this.useLogID;
	}

	@Override
	public void setUseLog(HashMap<UseInterval, FacilityUser> map) {
		this.useLog = map;
	}

	@Override
	public HashMap<UseInterval, FacilityUser> getUseLog() {
		return this.useLog;
	}
	
}
