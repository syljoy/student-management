package pers.syljoy.vo;

public class Student {
	private String stuId;
	private String stuName;
	private String stuPassword;
	private String stuBirthday;
	private String stuPhone;
	private String stuAddress;
	private double stuMath;
	private double stuEnglish;
	private double stuJava;
	private double stuC;
	private double stuPE;
	public Student() {
	}
	public Student(String stuId,String stuName,String stuPassword,String stuBirthday,String stuPhone,String stuAddress) {
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuPassword = stuPassword;
		this.stuBirthday = stuBirthday;
		this.stuPhone = stuPhone;
		this.stuAddress = stuAddress;
		this.stuMath = -1;
		this.stuEnglish = -1;
		this.stuJava = -1;
		this.stuC = -1;
		this.stuPE = -1;
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuPassword() {
		return stuPassword;
	}
	public void setStuPassword(String stuPassword) {
		this.stuPassword = stuPassword;
	}
	public String getStuBirthday() {
		return stuBirthday;
	}
	public void setStuBirthday(String stuBirthday) {
		this.stuBirthday = stuBirthday;
	}
	public String getStuPhone() {
		return stuPhone;
	}
	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
	public double getStuMath() {
		return stuMath;
	}
	public void setStuMath(double stuMath) {
		this.stuMath = stuMath;
	}
	public double getStuEnglish() {
		return stuEnglish;
	}
	public void setStuEnglish(double stuEnglish) {
		this.stuEnglish = stuEnglish;
	}
	public double getStuJava() {
		return stuJava;
	}
	public void setStuJava(double stuJava) {
		this.stuJava = stuJava;
	}
	public double getStuC() {
		return stuC;
	}
	public void setStuC(double stuC) {
		this.stuC = stuC;
	}
	public double getStuPE() {
		return stuPE;
	}
	public void setStuPE(double stuPE) {
		this.stuPE = stuPE;
	}
	public String toString() {
		return "Student[stuId="+stuId+",stuName="+stuName+",stuPassword="+stuPassword+",stuBirthday="+stuBirthday+",stuPhone="+stuPhone+",stuAddress="+stuAddress+",stuMath="+stuMath+",stuEnglish="+stuEnglish+",stuJava="+stuJava+",stuC="+stuC+",stuPE="+stuPE+"]";
	}
}
