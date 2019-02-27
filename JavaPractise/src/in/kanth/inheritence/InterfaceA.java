package in.kanth.inheritence;

public interface InterfaceA {

	public void fun1(String a1);

	public void fun2(String a1, Integer a2);

	public String fun3(String id);

	default void fun4(String id) {
		System.out.println("This is InterfaceA");
	}

}
