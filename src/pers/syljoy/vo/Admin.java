package pers.syljoy.vo;

public class Admin {
	private String adminId;
	private String adminPasswword;
	public Admin(){
	}
	public Admin(String adminId,String adminPasswword){
		this.adminId = adminId;
		this.adminPasswword = adminPasswword;
	}
	public String getId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getPasswword() {
		return adminPasswword;
	}
	public void setPwd(String adminPasswword) {
		this.adminPasswword = adminPasswword;
	}
	public String toString() {
		return "User[adminId=" + adminId +",adminPasswword=" + adminPasswword + "]";
	}
}

