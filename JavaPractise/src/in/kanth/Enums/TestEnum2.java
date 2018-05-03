package in.kanth.Enums;

public class TestEnum2 {

	enum Time {
		AM, PM
	}

	public static void main(String[] args) {
		   Time t1=Time.AM;
		   System.out.println(t1);

	}

	/**
	 * Enums should not declared under methods
	 */
	public static void fun() {
		/*
		 * enum Years{ AC,BC }
		 */
	}

}
