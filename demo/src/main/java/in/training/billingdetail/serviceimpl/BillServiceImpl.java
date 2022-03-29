package in.training.billingdetail.serviceimpl;

import java.time.LocalDate;
import java.util.List;

import daoImpl.BillDAOJDBCImpl;
import in.training.billingdetail.dao.BillDAO;
import in.training.billingdetail.domain.Bill;
import in.training.billingdetail.exception.OrderDetailNotFoundException;
import in.training.billingdetail.service.BillService;

public class BillServiceImpl implements BillService{
	
	private BillDAO billDAO;
	public BillServiceImpl() {
		billDAO = new BillDAOJDBCImpl();
	}
	@Override
	public void addBill(Bill bill) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateBill(Bill bill) {
		// TODO Auto-generated method stub
		billDAO.updateBill(bill);
		
	}
	@Override
	public void removeBill(Bill bill) throws OrderDetailNotFoundException {
		// TODO Auto-generated method stub
		billDAO.removeBill(bill);
		
	}
	@Override
	public void viewBill(Bill bill) {
		// TODO Auto-generated method stub
		billDAO.viewBill(bill);
		
	}
	@Override
	public List<Bill> viewBills(LocalDate startDate, LocalDate endDate) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Bill> viewBills(String custId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public double calculateTotalCost(Bill bill) {
		// TODO Auto-generated method stub
		return 0;
	}

}
