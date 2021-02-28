package facility.model;

import java.util.*;

public interface Facility {

	//public __ addNewFacility();
	//public __ removeFacility();
	public ArrayList<Facility> listFacilities();
	public ArrayList<FacilityInfo> getFacilityInformation();
	public FacilityCapacity requestAvailableCapacity();
	public void addFacilityDetail();
}
