package pers.syljoy.dao;

import java.sql.*;

public class BaseDao {
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	public Connection getConnect(){
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stums?useSSL=true&characterEncoding=utf-8", "root", "usbw");
			closeAll();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public void closeAll(){
		try {
			if(rs!=null)
				rs.close();
			if(pst != null)
				pst.close();
			if(con != null){
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
