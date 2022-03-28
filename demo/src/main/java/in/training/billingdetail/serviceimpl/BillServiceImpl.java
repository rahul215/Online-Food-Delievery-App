package in.training.billingdetail.serviceimpl;

import java.util.List;

import in.training.billingdetail.dao.BillDAO;
import in.training.billingdetail.domain.Bill;
import in.training.billingdetail.exception.OrderDetailNotFoundException;
import in.training.billingdetail.service.BillService;

public class BillServiceImpl implements BillService{
	
	private BillDAO billDAO;
	
	public BillServiceImpl() {
		billDAO = (BillDAO) new BillServiceImpl();
	}

	@Override
	public void createBill(Bill bill) {
		// TODO Auto-generated method stub
		billDAO.addBill(bill);
		
	}

	@Override
	public List<Bill> showAllBills() {
		// TODO Auto-generated method stub
		return billDAO.viewBills("");
	}

	@Override
	public void update(Integer id, String billDescription) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTraining(Integer id) throws OrderDetailNotFoundException {
		// TODO Auto-generated method stub
		
	}
	

//	private Bill bill;
//
//	@Override
//	public void addBill(Bill bill) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void updateBill(Bill bill) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void removeBill(Bill bill) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void viewBill(Bill bill) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public List<Bill> viewBills(LocalDate startDate, LocalDate endDate) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Bill> viewBills(String custId) {
//		// TODO Auto-generated method stub
//		List<Bill> billList = new ArrayList<>();
//		
//		return billList;
//	}
//
//	@Override
//	public double calculateTotalCost(Bill bill) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
