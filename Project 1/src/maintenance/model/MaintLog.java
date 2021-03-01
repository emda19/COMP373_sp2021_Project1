package maintenance.model;

import java.util.ArrayList;

// Record of all maintenance orders
public class MaintLog implements IMaintenance {

	private String maintLogID;
	private ArrayList<MaintRequest> requestLog; //list of all maintenance requests
	private ArrayList<Maintenance> maintSchedule; //list of all scheduled maintenance
	
	public MaintLog() {
		
	}

	@Override
	public void setMaintLogID(String id) {
		this.maintLogID = id;
	}

	@Override
	public String getMaintLogID() {
		return this.maintLogID;
	}

	@Override
	public void setRequestLog(ArrayList<MaintRequest> list) {
		this.requestLog = list;
	}

	@Override
	public ArrayList<MaintRequest> getRequestLog() {
		return this.requestLog;
	}

	@Override
	public void setMaintSchedule(ArrayList<Maintenance> list) {
		this.maintSchedule = list;
	}

	@Override
	public ArrayList<Maintenance> getMaintSchedule() {
		return this.maintSchedule;
	}
	
	
}
