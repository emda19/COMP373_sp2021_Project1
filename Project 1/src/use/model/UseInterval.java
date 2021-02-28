package use.model;

public class UseInterval {

	private int startMonth;
	private int startDay;
	private int startYear;
	private int endMonth;
	private int endDay;
	private int endYear;
	
	public UseInterval(int sm, int sd, int sy, int em, int ed, int ey) {
		this.startMonth = sm;
		this.startDay = sd;
		this.startYear = sy;
		this.endMonth = em;
		this.endDay = ed;
		this.endYear = ey;
	}
	
	public String toString() {
		String start = this.startMonth + "/" + this.startDay + "/" + this.startYear;
		String end = this.endMonth + "/" + this.endDay + "/" + this.endYear;
		String interval = start + " - " + end;
		return interval;
	}
}
