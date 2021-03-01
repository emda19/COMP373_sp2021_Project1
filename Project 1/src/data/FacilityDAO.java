package data;

import java.util.ArrayList;

import facility.model.Facility;
import facility.model.FacilityCapacity;
import facility.model.FacilityInfo;
import facility.model.IFacility;

public class FacilityDAO {

	
	public ArrayList<Facility> listFacilities() {
		return DataStorage.facilities;
	}
	
	/*
	public FacilityInfo getFacilityInformation(Facility f) {
		
	}
	
	public FacilityCapacity requestAvailableCapacity(Facility f) {
		
	}
	
	public Facility addNewFacility(Facility f) {
		DataStorage.facilities.add(f);
		return f;
	}
	
	public void addFacilityDetail() {}
	
	*/
	public Facility removeFacility(Facility f) {
		DataStorage.facilities.remove(f);
		return f;
	}
	
}
