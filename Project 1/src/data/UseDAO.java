package data;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import facility.model.Facility;
import inspection.model.Inspection;
import use.model.FacilityUser;
import use.model.UseInterval;

public class UseDAO {

	
	public boolean isInUseDuringInterval(Facility facility, UseInterval interval) {
		Facility f = DataStorage.facilities.get(facility);
		Date intervalStart = interval.getStartDate();
		Date intervalEnd = interval.getEndDate();
		HashMap<UseInterval, FacilityUser> map = f.getUseLog().getUseLog();
		Set<UseInterval> usageDates = map.keySet();
		for (UseInterval i : usageDates) {
			Date start = i.getStartDate();
			Date end = i.getEndDate();
			if (intervalStart.after(start) && intervalStart.before(end)) {
				return true;
			}
			else if (intervalEnd.after(start) && intervalEnd.before(end)) {
				return true;
			} else {
				continue;
			}
		}
		return false;
	}
	
	public HashMap<UseInterval, FacilityUser> assignFacilityToUse(Facility facility, FacilityUser user, UseInterval interval) {
		Facility f = DataStorage.facilities.get(facility);
		f.getUseLog().getUseLog().put(interval, user);
		return f.getUseLog().getUseLog();
	}
	
	public HashMap<UseInterval, FacilityUser> vacateFacility(Facility facility) {
		Facility f = DataStorage.facilities.get(facility);
		f.getUseLog().getUseLog().clear();
		return f.getUseLog().getUseLog();
	}
	
	public ArrayList<Inspection> listInspections(Facility facility) {
		Facility f = DataStorage.facilities.get(facility);
		ArrayList<Inspection> list = f.getInspectionLog().getInspectionLog();
		for (Inspection i : list) {
			System.out.println(i.toString());
		}
		return list;
	}
	
	public Set<Map.Entry<UseInterval, FacilityUser>> listActualUsage(Facility facility) {
		Facility f = DataStorage.facilities.get(facility);
		return f.getUseLog().getUseLog().entrySet();
	}
	
	public int calcUsageRate(Facility facility) {
		Facility f = DataStorage.facilities.get(facility);
		long diff = MaintenanceDAO.getTimeDiff(f);
		int usages = f.getUseLog().getUseLog().keySet().size();
		int rate = (int) (usages / diff);
		return rate;
	}
	
}
