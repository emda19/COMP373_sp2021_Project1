package maintenance.model;

import java.util.Date;

public class MaintOrder {

	private String orderID;
	private Date orderDate;
	private String orderDescription;
	private MaintCost cost;
	
	public MaintOrder(String id, Date date, String od, MaintCost cost) {
		this.orderID = id;
		this.orderDate = date;
		this.orderDescription = od;
		this.cost = cost;
	}
	
	//Get order ID
	public String getOrderID() {
		return this.orderID;
	}
	
	//Get order date
	public Date getOrderDate() {
		return this.orderDate;
	}
	
	//Set order date
	public void updateOrderDate(Date d) {
		this.orderDate = d;
	}
	
	//Get maintenance cost
	public MaintCost getMaintCost() {
		return this.cost;
	}
	
}
