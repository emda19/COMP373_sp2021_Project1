package maintenance.model;

public class FacilityMaintenance {

	private MaintSchedule schedule;
	private MaintRequest request;
	private MaintOrder order;
	private MaintLog log;
	
	public FacilityMaintenance(MaintSchedule s, MaintRequest r, MaintOrder o, MaintLog l) {
		this.schedule = s;
		this.request = r;
		this.order = o;
		this.log = l;
	}
	
	//Get schedule
	public MaintSchedule getMaintSchedule() {
		return this.schedule;
	}
	
	//Get request
	public MaintRequest getMaintRequest() {
		return this.request;
	}
	
	//Get order
	public MaintOrder getMaintOrder() {
		return this.order;
	}
	
	//Get log
	public MaintLog getMaintLog() {
		return this.log;
	}
}
