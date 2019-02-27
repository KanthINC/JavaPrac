package in.kanth.lamdasStreams;


public class Employee {

	private String name;
	private Gender gender;
	private int age;

	public Employee(String theName, Gender theGender, int theAge) {
		name = theName;
		gender = theGender;
		age = theAge;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Gender getGender() {
		return gender;
	}

	public String toString() {
		return String.format("%s -- %s -- %d", name, gender, age);
	}

}
