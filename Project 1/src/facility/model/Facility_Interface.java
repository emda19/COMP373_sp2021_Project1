package facility.model;

import java.util.*;

public interface Facility_Interface {

	//public __ addNewFacility();
	//public __ removeFacility();
	public ArrayList<Facility> listFacilities();
	public HashMap<Facility, FacilityInfo> getFacilityInformation();
	public FacilityCapacity requestAvailableCapacity();
	public void addFacilityDetail();
}
