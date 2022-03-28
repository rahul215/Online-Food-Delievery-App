package in.training.billingdetail.service;

import java.util.List;

import in.training.billingdetail.domain.Bill;
import in.training.billingdetail.exception.OrderDetailNotFoundException;

public interface BillService {

	/*
	 * This create project method will create the project in system
	 * project to be created
	 */
	void createBill(Bill bill);
	/*
	 * This showAllProjects method will return the list of available projects
	 * @return list of available projects
	 */
	List<Bill> showAllBills();
	/*
	 * This updateProject will update the project detail based on provided project 
	 */
	void update(Integer id,String billDescription);
	/*
	 * This remove method will remove the projects based on provided id
	 */
	void removeTraining(Integer id) throws OrderDetailNotFoundException;
}
