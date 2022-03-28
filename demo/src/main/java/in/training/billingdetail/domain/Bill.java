package in.training.billingdetail.domain;

import java.time.*;

public class Project {
	private String billId;
	LocalDateTime billDate = LocalDateTime.now();
	private int totalItem;
	private double totalCost;
	//private OrderDetails order;
	
	public Project(String billId, int totalItem, double totalCost) {
		super();
		this.billId = billId;
		this.totalItem = totalItem;
		this.totalCost = totalCost;
	}

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public LocalDateTime getBillDate() {
		return billDate;
	}

	public void setBillDate(LocalDateTime billDate) {
		this.billDate = billDate;
	}

	public int getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	 
	
	
}
