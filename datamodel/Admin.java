package datamodel;

public class Admin extends Instructors{

	private String adminId;
	private String password;
	private int totalAdmission;

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getTotalAdmission() {
		return totalAdmission;
	}

	public void setTotalAdmission(int totalAdmission) {
		this.totalAdmission = totalAdmission;
	}
}
