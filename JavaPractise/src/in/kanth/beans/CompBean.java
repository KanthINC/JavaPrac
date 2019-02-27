package in.kanth.beans;

public class CompBean {
	public CompBean(String compid, String compname) {
		super();
		this.compid = compid;
		this.compname = compname;
	}
	public String getCompid() {
		return compid;
	}
	public String getCompname() {
		return compname;
	}
	private String compid;
	private String compname;

}
