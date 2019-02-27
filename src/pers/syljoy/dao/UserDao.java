package pers.syljoy.dao;

import pers.syljoy.vo.Admin;
import pers.syljoy.vo.Student;

import java.sql.SQLException;

public class UserDao extends BaseDao{
	public Admin queryAdmin(String adminId){
		Admin admin = null;
		String sql = "select * from admin where adminId=?";
		con = getConnect();
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, adminId);
			rs = pst.executeQuery();
			if(rs.next()){
				admin = new Admin();
				admin.setAdminId(rs.getString(1));
				//admin.setName(rs.getString(1));
				admin.setPwd(rs.getString(2));
			}
			closeAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return admin;	
	}
	public Student queryStudent(String stuId){
		Student student = null;
		String sql = "select * from student where stuId=?";
		con = getConnect();
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, stuId);
			rs = pst.executeQuery();
			if(rs.next()){
				student = new Student();
				student.setStuId(rs.getString(1));
				student.setStuName(rs.getString(2));
				student.setStuPassword(rs.getString(3));
				student.setStuBirthday(rs.getString(4));
				student.setStuPhone(rs.getString(5));
				student.setStuAddress(rs.getString(6));
			}
			closeAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
	}
}