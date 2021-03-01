package data;

import java.util.Collection;
import java.util.Date;

import facility.model.Address;
import facility.model.Facility;
import facility.model.FacilityCapacity;
import facility.model.FacilityInfo;
import facility.model.FacilityManager;

public class FacilityDAO {

	
	public static Collection<Facility> listFacilities() {
		Collection<Facility> al = DataStorage.facilities.values();
		return al;
	}
	
	
	public FacilityInfo getFacilityInformation(Facility facility) {
		Facility f = DataStorage.facilities.get(facility);
		System.out.println(f.getFacilityInfo().toString());
		return f.getFacilityInfo();
	}
	
	public int requestAvailableCapacity(Facility facility) {
		Facility f = DataStorage.facilities.get(facility);
		FacilityCapacity c = f.getFacilityInfo().getFacilityCapacity();
		return c.getNumAvailableUnits();
	}
	
	public Facility addNewFacility(Facility f) {
		DataStorage.facilities.put(f,f);
		return f;
	}
	
	// public object addFacilityDetail()
	public FacilityInfo addFacilityDetail(Facility facility, String id, String name, Address address, 
			FacilityManager manager, FacilityCapacity capacity, Date date) {
		Facility f = DataStorage.facilities.get(facility);
		FacilityInfo info = f.getFacilityInfo();
		info.setFacilityID(id);
		info.setFacilityName(name);
		info.setFacilityAddress(address);
		info.setFacilityManager(manager);
		info.setFacilityCapacity(capacity);
		info.setOpenDate(date);
		return info;
	}
	
	
	public Facility removeFacility(Facility f) {
		DataStorage.facilities.remove(f);
		return f;
	}
	
}
