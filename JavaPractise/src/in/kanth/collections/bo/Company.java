package in.kanth.collections.bo;

public class Company {

	private String compId;

	public Company(String compId) {
		super();
		this.compId = compId;
		System.out.println("New object created");
	}

	public String getCompId() {
		return compId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((compId == null) ? 0 : compId.hashCode());
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
		Company other = (Company) obj;
		if (compId == null) {
			if (other.compId != null)
				return false;
		} else if (!compId.equals(other.compId))
			return false;
		return true;
	}


	
}
