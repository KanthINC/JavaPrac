package in.kanth.impprograms;

/**
 * 
 * @author ramakanth.b Des: find whether the string rotated is from actual
 *         string
 */
public class CyclicStringCheck {

	public static void main(String[] args) {

		String actual = "Ramakanth";
		String rotated = "akanthRam";

		boolean check = check(actual, rotated);
		System.out.println(check ? "Its is roatated string" : "Not from actual string");

	}

	private static boolean check(String actual, String rotated) {
		String mytempString = rotated + rotated;
		return mytempString.contains(actual) ? true : false;

	}

}
