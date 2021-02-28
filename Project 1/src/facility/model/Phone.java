package facility.model;

public class Phone {

	private String areaCode;
	private String phoneNumber;
	
	public Phone(String ac, String pn) {
		//Validate area code
		if (ac.length() == 3) {
			this.areaCode = ac;
		} else {
			System.out.println("Error: Invalid area code");
			return;
		}
		//Validate phone number
		if (pn.length() == 7) {
			this.phoneNumber = pn;
		} else {
			System.out.println("Error: Invalid area code");
			return;
		}
	}
	
	//Override toString
	public String toString() {
		if (this.areaCode.length() == 0 || this.phoneNumber.length() == 0) {
			return "Error: Invalid";
		} else {
			String s = "(" + this.areaCode + ") " + this.phoneNumber.substring(0,3) + "-" + this.phoneNumber.substring(3);
			return s;
		}
	}
	
}
