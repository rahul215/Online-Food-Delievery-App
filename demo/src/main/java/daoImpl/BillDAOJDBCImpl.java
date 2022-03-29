package daoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import in.training.billingdetail.dao.BillDAO;
import in.training.billingdetail.domain.Bill;
import in.training.billingdetail.exception.OrderDetailNotFoundException;
import in.training.billingdetail.util.DBUtil;

public class BillDAOJDBCImpl extends DBUtil implements BillDAO{

	@Override
	public void addBill(Bill bill) {
		// TODO Auto-generated method stub
		String sql = "insert into users (billId,billDate,totalCost,totalItem,orderDetails) values (?,?,?,?,?)";
		PreparedStatement pstmt = preparedStatement(sql);
		try {
			pstmt.setString(1, bill.getBillId());
			pstmt.setString(2, bill.getBillDate().toString());
			pstmt.setDouble(3, bill.getTotalCost());
			pstmt.setInt(4, bill.getTotalItem());
			pstmt.setString(5, bill.getOrder().toString());
			pstmt.execute();
		} catch (Exception e) {
			System.out.println("Problem is : "+ e.getMessage());
		}
		finally {
			closePreparedStatement();
			closeConnection();
		}
		
	}

	@Override
	public void updateBill(Bill bill) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeBill(Bill bill) throws OrderDetailNotFoundException {
		// TODO Auto-generated method stub
		String sql = "select * from users";
		PreparedStatement pstmt = preparedStatement(sql);
		ResultSet rs;
		boolean found = false;
		try {

			rs = pstmt.executeQuery();
			while(rs.next()) {
				if(rs.getInt("id") == Integer.parseInt(bill.getBillId())) {
					found = true;
				}
			}
			
		} 
		catch (SQLException e) {
		System.out.println("Problem is : " + e.getMessage());
			}
		finally {
			closePreparedStatement();
			closeConnection();
				}
			
		
		if(found == true) {
			try {
				String sql1 = "delete from bill where id=?";
				PreparedStatement pstmt1 = preparedStatement(sql1);
				pstmt1.setInt(1,Integer.parseInt(bill.getBillId()));
				pstmt1.execute();
			} catch (Exception e) {
				System.out.println("Problem is : " + e.getMessage());
			}
			finally {
				closePreparedStatement();
				closeConnection();
			}
		}
		else {
			throw new OrderDetailNotFoundException("user is not found with id : "+bill.getBillId());
		}
		
	}

	@Override
	public void viewBill(Bill bill) {
		// TODO Auto-generated method stub
		System.out.println("Bill ID: " + bill.getBillId());
		System.out.println("Bill Date: " + bill.getBillDate());
		System.out.println("Food List: " + bill.getOrder().getCart().getFoodList().toString());
		System.out.println("Total Item: " + bill.getTotalItem());
		System.out.println("Total Cost: " + bill.getTotalCost());
	}

	@Override
	public List<Bill> viewBills(LocalDate startDate, LocalDate endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bill> viewBills(String custId) {
		// TODO Auto-generated method stub
		String sql = "select * from users";
		PreparedStatement pstmt = preparedStatement(sql);
		Bill bill;
		List<Bill> billList = new ArrayList<>();
		try {
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				if(rs.getInt("id") == Integer.parseInt(custId)) {
					bill = new Bill();
					bill.setBillId(rs.getString("id"));
					bill.setBillDate(rs.getDate("billDate").toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
					bill.setTotalCost(rs.getDouble("totalCost"));
					bill.setTotalItem(rs.getInt("totalItem"));
					billList.add(bill);
				}
			}
		} catch (SQLException e) {
			System.out.println("Problem is : " + e.getMessage());
		}
		finally {
			closePreparedStatement();
			closeConnection();
			
		}
		return billList;
	}

	@Override
	public double calculateTotalCost(Bill bill) {
		// TODO Auto-generated method stub
		return bill.getTotalCost();
	}

}
