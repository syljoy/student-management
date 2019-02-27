package pers.syljoy.dao;

import pers.syljoy.vo.Student;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao extends BaseDao{
	public int addStudent(Student student){
		int result = 0;
		String sql = "insert into student values(?,?,?,?,?,?,?,?,?,?,?)";
		con = getConnect();
		try{
			pst = con.prepareStatement(sql);
			pst.setString(1, student.getStuId());
			pst.setString(2, student.getStuName());
			pst.setString(3, student.getStuPassword());
			pst.setString(4, student.getStuBirthday());
			pst.setString(5, student.getStuPhone());
			pst.setString(6, student.getStuAddress());
			pst.setDouble(7, student.getStuMath());
			pst.setDouble(8, student.getStuEnglish());
			pst.setDouble(9, student.getStuJava());
			pst.setDouble(10, student.getStuC());
			pst.setDouble(11, student.getStuPE());
			result = pst.executeUpdate();
			closeAll();
		} catch(SQLException e){
			e.printStackTrace();
		}
		return result;
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
	public List<Student> queryAll(){
		List<Student> studentList = new ArrayList<Student>();
		String sql = "select * from student";
		con = getConnect();
		try{
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()){
				Student student = new Student();
				student.setStuId(rs.getString(1));
				student.setStuName(rs.getString(2));
				student.setStuPassword(rs.getString(3));
				student.setStuBirthday(rs.getString(4));
				student.setStuPhone(rs.getString(5));
				student.setStuAddress(rs.getString(6));
				student.setStuMath(rs.getDouble(7));
				student.setStuEnglish(rs.getDouble(8));
				student.setStuJava(rs.getDouble(9));
				student.setStuC(rs.getDouble(10));
				student.setStuPE(rs.getDouble(11));
				studentList.add(student);
			}
			closeAll();
		} catch (SQLException e){
			e.printStackTrace();
		}
		return studentList;
	}
	public int delStudent(String stuId){
		int result = 0;
		String sql = "delete from student where stuId=?";
		con = getConnect();
		try{
			pst = con.prepareStatement(sql);
			pst.setString(1, stuId);
			result=pst.executeUpdate();
			closeAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public int updateStuName(String stuId,String stuName){
		int result = 0;
		String sql = "update student set stuName=? where stuId=?";
		con = getConnect();
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, stuName);
			pst.setString(2, stuId);
			result = pst.executeUpdate();
			closeAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public int updateStuPassword(String stuId,String stuPassword){
		int result = 0;
		String sql = "update student set stuPassword=? where stuId=?";
		con = getConnect();
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, stuPassword);
			pst.setString(2, stuId);
			result = pst.executeUpdate();
			closeAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public int updateStuBirthday(String stuId,String stuBirthday){
		int result = 0;
		String sql = "update student set stuBirthday=? where stuId=?";
		con = getConnect();
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, stuBirthday);
			pst.setString(2, stuId);
			result = pst.executeUpdate();
			closeAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public int updateStuPhone(String stuId,String stuPhone){
		int result = 0;
		String sql = "update student set stuPhone=? where stuId=?";
		con = getConnect();
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, stuPhone);
			pst.setString(2, stuId);
			result = pst.executeUpdate();
			closeAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public int updateStuAddress(String stuId,String stuAddress){
		int result = 0;
		String sql = "update student set stuAddress=? where stuId=?";
		con = getConnect();
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, stuAddress);
			pst.setString(2, stuId);
			result = pst.executeUpdate();
			closeAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public int updateStuMath(String stuId,double stuMath){
		int result = 0;
		String sql = "update student set stuMath=? where stuId=?";
		con = getConnect();
		try {
			pst = con.prepareStatement(sql);
			pst.setDouble(1, stuMath);
			pst.setString(2, stuId);
			result = pst.executeUpdate();
			closeAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public int updateStuEnglish(String stuId,double stuEnglish){
		int result = 0;
		String sql = "update student set stuEnglish=? where stuId=?";
		con = getConnect();
		try {
			pst = con.prepareStatement(sql);
			pst.setDouble(1, stuEnglish);
			pst.setString(2, stuId);
			result = pst.executeUpdate();
			closeAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public int updateStuJava(String stuId,double stuJava){
		int result = 0;
		String sql = "update student set stuJava=? where stuId=?";
		con = getConnect();
		try {
			pst = con.prepareStatement(sql);
			pst.setDouble(1, stuJava);
			pst.setString(2, stuId);
			result = pst.executeUpdate();
			closeAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public int updateStuC(String stuId,double stuC){
		int result = 0;
		String sql = "update student set stuC=? where stuId=?";
		con = getConnect();
		try {
			pst = con.prepareStatement(sql);
			pst.setDouble(1, stuC);
			pst.setString(2, stuId);
			result = pst.executeUpdate();
			closeAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public int updateStuPE(String stuId,double stuPE){
		int result = 0;
		String sql = "update student set stuPE=? where stuId=?";
		con = getConnect();
		try {
			pst = con.prepareStatement(sql);
			pst.setDouble(1, stuPE);
			pst.setString(2, stuId);
			result = pst.executeUpdate();
			closeAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public int updateStu(Student student){
		int result = 0;
		String sql = "update student set stuName=?,stuPassword=?,stuBirthday=?,stuPhone=?,stuAddress=? where stuId=?";
		con = getConnect();
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, student.getStuName());
			pst.setString(2, student.getStuPassword());
			pst.setString(3, student.getStuBirthday());
			pst.setString(4, student.getStuPhone());
			pst.setString(5, student.getStuAddress());
			pst.setString(6, student.getStuId());
			result = pst.executeUpdate();
			closeAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
