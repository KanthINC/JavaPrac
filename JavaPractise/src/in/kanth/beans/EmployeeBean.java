package in.kanth.beans;

public class EmployeeBean {
	
	@Override
	public String toString() {
		return "EmployeeBean [empid=" + empid + ", dob=" + dob + ", complang=" + complang + ", comid=" + comid + "]";
	}
	String empid;
	String dob;
	String complang;
	String comid;
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getComplang() {
		return complang;
	}
	public void setComplang(String complang) {
		this.complang = complang;
	}
	public String getComid() {
		return comid;
	}
	public void setComid(String comid) {
		this.comid = comid;
	}
	

}
