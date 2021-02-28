package facility.model;

public class FacilityCapacity {

	private int totalUnits;
	private int rentedUnits;
	
	public FacilityCapacity() {}
	
	//Set total units
	public void setTotalUnits(int total) {
		this.totalUnits = total;
	}
	
	//Get total units
	public int getTotalUnits() {
		return this.totalUnits;
	}
	
	//Set rented units
	public void setRentedUnits(int rented) {
		this.rentedUnits = rented;
	}
	
}
