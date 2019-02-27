package in.kanth.beans;

public class ManagerBean{
	public String getManid() {
		return manid;
	}
	public String getDesc() {
		return desc;
	}
	public ManagerBean(String manid, String desc) {
		super();
		this.manid = manid;
		this.desc = desc;
	}
	private String manid;
	private String desc;
	
	
}
