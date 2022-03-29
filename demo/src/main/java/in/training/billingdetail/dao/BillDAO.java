package in.training.billingdetail.dao;

import java.time.LocalDate;
import java.util.List;

import in.training.billingdetail.domain.Bill;
import in.training.billingdetail.exception.OrderDetailNotFoundException;

public interface BillDAO {
	
	void addBill(Bill bill);
	
	void updateBill(Bill bill);
	
	void removeBill(Bill bill) throws OrderDetailNotFoundException;
	
	void viewBill(Bill bill);
	
	List<Bill> viewBills(LocalDate startDate, LocalDate endDate);
	
	List<Bill> viewBills(String custId);
	
	double calculateTotalCost(Bill bill);

}
