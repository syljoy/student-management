package pers.syljoy.service;

import pers.syljoy.dao.UserDao;
import pers.syljoy.vo.Admin;
import pers.syljoy.vo.Student;

public class UserService {
	UserDao dao = new UserDao();
	public Admin queryAdmin(String name){
		return dao.queryAdmin(name);
	}
	public Student queryStudent(String stuId){
		return dao.queryStudent(stuId);
	}
}
