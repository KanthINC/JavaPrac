package in.kanth.beans;

public class TaxCombine {
	private String sys_item;
	private String type;
	private String combine_name;
	private String client_item;
	public String getSys_item() {
		return sys_item;
	}
	public void setSys_item(String sys_item) {
		this.sys_item = sys_item;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public TaxCombine(String sys_item, String type, String combine_name, String client_item) {
		super();
		this.sys_item = sys_item;
		this.type = type;
		this.combine_name = combine_name;
		this.client_item = client_item;
	}
	public String getCombine_name() {
		return combine_name;
	}
	public void setCombine_name(String combine_name) {
		this.combine_name = combine_name;
	}
	public String getClient_item() {
		return client_item;
	}
	public void setClient_item(String client_item) {
		this.client_item = client_item;
	}
	
	
	
	
}
