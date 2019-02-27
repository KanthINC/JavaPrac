package in.kanth.beans;

public class EmpBean {
	private String empid;
	private String uid;

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getUid() {
		return uid;
	}

	public EmpBean(String empid, String uid) {
		super();
		this.empid = empid;
		this.uid = uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
}