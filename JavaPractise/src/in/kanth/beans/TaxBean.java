package in.kanth.beans;

public class TaxBean {

	@Override
	public String toString() {
		return "TaxBean [id=" + id + ", name=" + name + ", val=" + val + "]";
	}
	private String id;
	private String name;
	private Double val;
	public String getId() {
		return id;
	}
	public TaxBean(String id, String name, Double val) {
		super();
		this.id = id;
		this.name = name;
		this.val = val;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaxBean other = (TaxBean) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getVal() {
		return val;
	}
	public void setVal(Double val) {
		this.val = val;
	}
	
}
