package in.kanth.inheritence;

public interface InterfaceB {
	public void fun1(String a1);

	public void fun2(Integer a1, Integer a2);

	public String fun3(Double id);
	
	default void fun4(String id) {
		System.out.println("This is InterfaceB");
	}
}
