package in.training.billingdetail.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import in.training.billingdetail.domain.Bill;
import in.training.billingdetail.domain.Foodcart;
import in.training.billingdetail.domain.Item;
import in.training.billingdetail.domain.OrderDetail;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BillServiceImpl im = new BillServiceImpl();
		Bill bill = new Bill();
		List<Item> itemList = new ArrayList<>();
		itemList.add(new Item("101", "Pizza", 1, 399.99));
		itemList.add(new Item("102", "Burger", 2, 159.00));
		bill.setBillId("1");
		bill.setOrder(new OrderDetail(12, new Foodcart("22", itemList)));
		bill.setTotalCost(100);
		bill.setTotalItem(4);
		im.addBill(bill);
		
	}

}
