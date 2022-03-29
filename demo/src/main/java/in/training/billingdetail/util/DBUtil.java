package in.training.billingdetail.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@SuppressWarnings({ "rawtypes", "unused" })
public class DBUtil {
	
	private static final String driverClassName = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/userdb";
	private String username = "root";
	private String password = "root";
	private static Connection conn = null;
	private PreparedStatement pstmt = null;

	
	static {
		try {
			Class c = Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	private Connection connect() {
		try {
			conn = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public PreparedStatement preparedStatement(String sql) {
		try {
			 pstmt = connect().prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pstmt;
	}
	public void closePreparedStatement() {
		try {
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
