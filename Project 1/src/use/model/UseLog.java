package use.model;

import java.util.ArrayList;

public class UseLog implements IUse {
	
	private String useLogID;
	private ArrayList<UseSchedule> useLog;
	
	public UseLog() {
		this.useLog = new ArrayList<UseSchedule>();
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
	public void setUseLog(ArrayList<UseSchedule> list) {
		this.useLog = list;
	}

	@Override
	public ArrayList<UseSchedule> getUseLog() {
		return this.useLog;
	}
	
	
}
