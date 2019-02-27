package in.kanth.beans;

public class TaxNatureBean {

	private String payitemid;

	private String payitemdesc;

	private String tax_nature;
	
	@Override
	public String toString() {
		return "TaxNatureBean [payitemid=" + payitemid + ", payitemdesc=" + payitemdesc + ", tax_nature=" + tax_nature
				+ ", non_monetary=" + non_monetary + ", tax_paid=" + tax_paid + "]";
	}

	private String non_monetary;

	private String tax_paid;

	public TaxNatureBean() {
		super();
	}

	public String getPayitemid() {
		return payitemid;
	}

	public void setPayitemid(String payitemid) {
		this.payitemid = payitemid;
	}

	public String getPayitemdesc() {
		return payitemdesc;
	}

	public void setPayitemdesc(String payitemdesc) {
		this.payitemdesc = payitemdesc;
	}

	public String getTax_nature() {
		return tax_nature;
	}

	public void setTax_nature(String tax_nature) {
		this.tax_nature = tax_nature;
	}

	public String getNon_monetary() {
		return non_monetary;
	}

	public void setNon_monetary(String non_monetary) {
		this.non_monetary = non_monetary;
	}

	public String getTax_paid() {
		return tax_paid;
	}

	public void setTax_paid(String tax_paid) {
		this.tax_paid = tax_paid;
	}
	

	public TaxNatureBean(TaxCombine combine) {
		payitemid=combine.getSys_item();
		payitemdesc=combine.getCombine_name();
		
		if("tax_paid".equals(combine.getType())){
			tax_paid=combine.getClient_item(); 
		}
		if("tax_nature".equals(combine.getType())){
			tax_nature=combine.getClient_item(); 
		}
		if("non_monetary".equals(combine.getType())){
			non_monetary=combine.getClient_item(); 
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((payitemdesc == null) ? 0 : payitemdesc.hashCode());
		result = prime * result + ((payitemid == null) ? 0 : payitemid.hashCode());
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
		TaxNatureBean other = (TaxNatureBean) obj;
		if (payitemdesc == null) {
			if (other.payitemdesc != null)
				return false;
		} else if (!payitemdesc.equals(other.payitemdesc))
			return false;
		if (payitemid == null) {
			if (other.payitemid != null)
				return false;
		} else if (!payitemid.equals(other.payitemid))
			return false;
		return true;
	}
	
	
}
