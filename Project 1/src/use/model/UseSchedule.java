package use.model;

public class UseSchedule {

	private FacilityUser user;
	private UseInterval interval;
	
	public UseSchedule(FacilityUser user, UseInterval interval) {
		this.user = user;
		this.interval = interval;
	}
	
	public void setUser(FacilityUser user) {
		this.user = user;
	}
	
	public FacilityUser getUser() {
		return this.user;
	}
	
	public void setUseInterval(UseInterval interval) {
		this.interval = interval;
	}
	
	public UseInterval getUseInterval() {
		return this.interval;
	}
}
