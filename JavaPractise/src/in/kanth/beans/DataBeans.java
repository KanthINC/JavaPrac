package in.kanth.beans;

public class DataBeans {
 
	private Long id;
	
	private String name;
	
	private Integer emailid;
	
	private String peid;
	
	private Double sal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEmailid() {
		return emailid;
	}

	public void setEmailid(Integer emailid) {
		this.emailid = emailid;
	}

	public String getPeid() {
		return peid;
	}

	public void setPeid(String peid) {
		this.peid = peid;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public DataBeans(Long id, String name, Integer emailid, String peid, Double sal) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.peid = peid;
		this.sal = sal;
	}
	
}
