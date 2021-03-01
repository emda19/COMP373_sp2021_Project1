package data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import facility.model.Facility;
import maintenance.model.MaintCost;
import maintenance.model.MaintRequest;
import maintenance.model.Maintenance;

public class MaintenanceDAO {

	
	public MaintRequest makeFacilityMaintRequest(Facility facility, String id, Date d, String des, boolean status) {
		MaintRequest request = new MaintRequest();
		request.setRequestID(id);
		request.setDateRequested(d);
		request.setRequestDescription(des);
		request.setRequestStatus(status);
		Facility f = DataStorage.facilities.get(facility);
		f.getMaintLog().getRequestLog().add(request);
		return request;
	}
	
	public Maintenance scheduleMaintenance(Facility facility, String id, MaintCost cost, Date date) {
		Maintenance m = new Maintenance(id, cost, date);
		Facility f = DataStorage.facilities.get(facility);
		f.getMaintLog().getMaintSchedule().add(m);
		return m;
	}
	
	public float calcMaintenanceCostForFacility(Facility facility) { //assuming all maintenance jobs
		Facility f = DataStorage.facilities.get(facility);
		ArrayList<Maintenance> maint = f.getMaintLog().getMaintSchedule();
		float totalCost = 0;
		for (Maintenance m : maint) {
			totalCost += m.getMaintCost().getTotalCost();
		}
		return totalCost;
	}
	
	public static long getTimeDiff(Facility facility) {
		Facility f = DataStorage.facilities.get(facility);
		//Find Time between now and open date
		SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/YYYY");
		Date today = new Date();
		Date open = f.getFacilityInfo().getOpenDate();
		try {
			today = sdf.parse(today.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			open = sdf.parse(open.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		long diffInMillies = Math.abs(today.getTime() - open.getTime());
		long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
		return diff;
	}
	
	public long calcProblemRateForFacility(Facility facility) {
		Facility f = DataStorage.facilities.get(facility);
		long diff = getTimeDiff(f);
		long numProblems = f.getMaintLog().getMaintSchedule().size(); //Number of maintenance jobs done
		long problemRate = numProblems / diff;
		
		return problemRate;
	}
	
	public int calcDownTimeForFacility(Facility facility) {
		Facility f = DataStorage.facilities.get(facility);
		long timeDiff = getTimeDiff(f);
		int useSize = f.getUseLog().getUseLog().size();
		int downTime = (int) (useSize / timeDiff);
		return downTime;
	}
	
	public ArrayList<MaintRequest> listMaintRequests(Facility facility) {
		Facility f = DataStorage.facilities.get(facility);
		ArrayList<MaintRequest> requests = f.getMaintLog().getRequestLog();
		for (MaintRequest m : requests) {
			System.out.println(m.toString());
		}
		return requests;
	}
	
	public ArrayList<Maintenance> listMaintenance(Facility facility) {
		Facility f = DataStorage.facilities.get(facility);
		ArrayList<Maintenance> maint = f.getMaintLog().getMaintSchedule();
		for (Maintenance m : maint) {
			System.out.println(m.toString());
		}
		return maint;
	}
	
	public ArrayList<String> listFacilityProblems(Facility facility) { //take the descriptions of all maintenance requests
		Facility f = DataStorage.facilities.get(facility);
		ArrayList<String> problems = new ArrayList<String>();
		for (MaintRequest m : f.getMaintLog().getRequestLog()) {
			problems.add(m.getRequestDescription());
		}
		return problems;
	}
	
}
