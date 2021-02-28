package facility.model;

import java.util.*;

public interface Facility_Interface {

	//public __ addNewFacility();
	//public __ removeFacility();
	public ArrayList<Facility_Interface> listFacilities();
	public ArrayList<FacilityInfo> getFacilityInformation();
	public FacilityCapacity requestAvailableCapacity();
	public void addFacilityDetail();
}
