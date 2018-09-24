package org.kanth.ocjp.bascis;

/**
 * Find the output
 * @author ramakanth.b
 *
 */
public class Test5 {

	int a;

	public static void main(String[] args) {
		Test5 t = new Test5();
		int a = 6;
		System.out.println(a);
		t.fun1();
		System.out.println(a);
		System.out.println(t.a);
	}

	private void fun1() {
		int a = 5;
		fun2();
		System.out.println(a);
	}

	private void fun2() {
		a = 4;
	}

}
