package in.kanth.beans;

public class PersonBean {
    String name="";
    @Override
	public String toString() {
		return "PersonBean [name=" + name + ", dob=" + dob + ", country=" + country + ", lang=" + lang + "]";
	}
	String dob="";
    String country="";
    String lang="";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
    
	
}
