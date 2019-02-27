package in.kanth.interviews;

public class EmpSal {

	public EmpSal(String name, String id, Double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	private String name;
	private String id;
	private Double sal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	
}
