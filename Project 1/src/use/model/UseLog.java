package use.model;

import java.util.ArrayList;

public class UseLog implements IUse {
	
	private String useLogID;
	private ArrayList<Usage> useLog;
	
	public UseLog() {
		this.useLog = new ArrayList<Usage>();
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
	public void setUseLog(ArrayList<Usage> map) {
		this.useLog = map;
	}

	@Override
	public ArrayList<Usage> getUseLog() {
		return this.useLog;
	}
	
}
