package in.kanth.inheritence;

public class ClassIAIB implements InterfaceA, InterfaceB {

	@Override
	public void fun2(Integer a1, Integer a2) {
		System.out.println("This is fun2");

	}

	@Override
	public String fun3(Double id) {
		System.out.println("This is fun3");
		return null;
	}

	@Override
	public void fun1(String a1) {
		System.out.println("This is fun1");

	}

	@Override
	public void fun2(String a1, Integer a2) {
		System.out.println("This is fun2");

	}

	@Override
	public String fun3(String id) {
		System.out.println("This is fun3");
		return null;
	}

	@Override
	public void fun4(String id) {
		InterfaceA.super.fun4(id);
	}
}
