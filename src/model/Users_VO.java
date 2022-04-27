package model;

public class Users_VO {
	private int uPoint, uAdmin, uAge;
	private String uPk, uPw, uName;
	@Override
	public String toString() {
		return "Users_VO [uPoint=" + uPoint + ", uAdmin=" + uAdmin + ", uAge=" + uAge + ", uPk=" + uPk + ", uPw=" + uPw
				+ ", uName=" + uName + "]";
	}
	public int getuPoint() {
		return uPoint;
	}
	public void setuPoint(int uPoint) {
		this.uPoint = uPoint;
	}
	public int getuAdmin() {
		return uAdmin;
	}
	public void setuAdmin(int uAdmin) {
		this.uAdmin = uAdmin;
	}
	public int getuAge() {
		return uAge;
	}
	public void setuAge(int uAge) {
		this.uAge = uAge;
	}
	public String getuPk() {
		return uPk;
	}
	public void setuPk(String uPk) {
		this.uPk = uPk;
	}
	public String getuPw() {
		return uPw;
	}
	public void setuPw(String uPw) {
		this.uPw = uPw;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}

}
