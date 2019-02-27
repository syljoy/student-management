package pers.syljoy.service;

import pers.syljoy.dao.StudentDao;
import pers.syljoy.vo.Student;

import java.util.List;

public class StudentService {
	StudentDao dao = new StudentDao();
	public int addStudent(Student student){
		return dao.addStudent(student);
	}
	public Student queryStudent(String stuId){
		return dao.queryStudent(stuId);
	}
	public List<Student> queryAll(){
		return dao.queryAll();
	}
	public int delStudent(String stuId){
		return dao.delStudent(stuId);
	}
	public int updateStuName(String stuId,String stuName){
		return dao.updateStuName(stuId, stuName);
	}
	public int updateStuPassword(String stuId,String stuPassword){
		return dao.updateStuPassword(stuId, stuPassword);
	}
	public int updateStuBirthday(String stuId,String stuBirthday){
		return dao.updateStuBirthday(stuId, stuBirthday);
	}
	public int updateStuPhone(String stuId, String stuPhone){
		return dao.updateStuPhone(stuId, stuPhone);
	}
	public int updateStuAddress(String stuId,String stuAddress){
		return dao.updateStuAddress(stuId, stuAddress);
	}
	public int updateStuMath(String stuId,double stuMath){
		return dao.updateStuMath(stuId, stuMath);
	}
	public int updateStuEnglish(String stuId,double stuEnglish){
		return dao.updateStuEnglish(stuId, stuEnglish);
	}
	public int updateStuJava(String stuId,double stuJava){
		return dao.updateStuJava(stuId, stuJava);
	}
	public int updateStuC(String stuId,double stuC){
		return dao.updateStuC(stuId, stuC);
	}
	public int updateStuPE(String stuId,double stuPE){
		return dao.updateStuPE(stuId, stuPE);
	}
	public int updateStu(Student student){
		return dao.updateStu(student);
	}
}
