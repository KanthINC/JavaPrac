package in.kanth.collections.bo;

public class Employee {

	public Employee(String guid, String empid, String email) {
		super();
		this.guid = guid;
		this.empid = empid;
		this.email = email;
	}
	private String guid;
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String empid;
	private String email;
	
}
