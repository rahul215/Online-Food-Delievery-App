package in.training.billingdetail.domain;

import java.time.*;

public class Bill {
	private String billId;
	LocalDateTime billDate = LocalDateTime.now();
	private int totalItem;
	private double totalCost;
	private OrderDetail order;
	
	public Bill() {}
	
	public Bill(String billId, int totalItem, double totalCost, OrderDetail orderDetail) {
		super();
		this.billId = billId;
		this.totalItem = totalItem;
		this.totalCost = totalCost;
		this.order = orderDetail;
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

	public OrderDetail getOrder() {
		return order;
	}

	public void setOrder(OrderDetail order) {
		this.order = order;
	}
	
	
	
}
