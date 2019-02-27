package in.kanth.tricky;

/**
 * 
 * @author ramakanth.b
 *
 */
public strictfp class FloatingPointErrors {

	public static void main(String[] args) {
		double a = 10;
		double b = 3;
		double c = divide(a, b);

		double a1 = 2;
		double b1 = 3;
		double c1 = divide(a1, b1);

		double a2 = 8;
		double b2 = 3;
		double c2 = divide(a2, b2);

		double res = add(c1, c2);  
		if (res == c) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		System.out.println(c);
		System.out.println(res);
	}

	private static double divide(double a, double b) {
		return a / b;
	}

	private static double add(double a, double b) {
		return a + b;
	}

}
