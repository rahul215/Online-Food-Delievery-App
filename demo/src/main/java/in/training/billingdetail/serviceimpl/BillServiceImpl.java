package in.training.billingdetail.serviceimpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import in.training.billingdetail.dao.BillDAO;
import in.training.billingdetail.domain.Bill;

public class BillServiceImpl implements BillDAO{
	
	private Bill bill;

	@Override
	public void addBill(Bill bill) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBill(Bill bill) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeBill(Bill bill) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewBill(Bill bill) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Bill> viewBills(LocalDate startDate, LocalDate endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bill> viewBills(String custId) {
		// TODO Auto-generated method stub
		List<Bill> billList = new ArrayList<>();
		
		return billList;
	}

	@Override
	public double calculateTotalCost(Bill bill) {
		// TODO Auto-generated method stub
		return 0;
	}

}
