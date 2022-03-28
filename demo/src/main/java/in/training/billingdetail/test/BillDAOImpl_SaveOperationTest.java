package in.training.billingdetail.test;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

import in.training.billingdetail.dao.BillDAO;
import in.training.billingdetail.domain.Bill;

public class BillDAOImpl_SaveOperationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BillDAO projectDAO =new BillDAO();
		Bill project = new Bill();
		project.setBillId("101");
		project.setTotalItem(1);
		project.setTotalCost(100.23);
		projectDAO.addBill(project);
		System.out.println("Success Project Saved");
		
		List<Bill>projects = projectDAO.viewBills("");
		System.out.println(projects);

}
