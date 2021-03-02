package data;

import java.util.ArrayList;
import java.util.Date;

import facility.model.Facility;
import inspection.model.Inspection;
import use.model.FacilityUser;
import use.model.Usage;
import use.model.UseInterval;

public class UseDAO {

	
	public boolean isInUseDuringInterval(Facility facility, UseInterval interval) {
		Facility f = DataStorage.facilities.get(facility);
		Date intervalStart = interval.getStartDate();
		Date intervalEnd = interval.getEndDate();
		ArrayList<Usage> usage = f.getUseLog().getUseLog();
		ArrayList<UseInterval> usageDates = new ArrayList<UseInterval>();
		for (Usage u : usage) {
			usageDates.add(u.getUseInterval());
		}
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
	
	public Usage assignFacilityToUse(Facility facility, FacilityUser user, UseInterval interval) {
		Facility f = DataStorage.facilities.get(facility);
		Usage u = new Usage(user, interval);
		f.getUseLog().getUseLog().add(u);
		return u;
	}
	
	public ArrayList<Usage> vacateFacility(Facility facility) {
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
	
	public ArrayList<Usage> listActualUsage(Facility facility) {
		Facility f = DataStorage.facilities.get(facility);
		return f.getUseLog().getUseLog();
	}
	
	public int calcUsageRate(Facility facility) {
		Facility f = DataStorage.facilities.get(facility);
		long diff = MaintenanceDAO.getTimeDiff(f);
		int usages = f.getUseLog().getUseLog().size();
		int rate = (int) (usages / diff);
		return rate;
	}
	
}
