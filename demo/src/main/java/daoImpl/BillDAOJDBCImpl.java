package daoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import in.training.billingdetail.dao.BillDAO;
import in.training.billingdetail.domain.Bill;
import in.training.billingdetail.exception.OrderDetailNotFoundException;
import in.training.billingdetail.util.DBUtil;

public class BillDAOJDBCImpl extends DBUtil implements BillDAO{

	@Override
	public void addBill(Bill bill) {
		// TODO Auto-generated method stub
		
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
