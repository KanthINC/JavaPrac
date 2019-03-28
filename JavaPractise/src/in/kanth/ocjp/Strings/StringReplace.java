package in.kanth.ocjp.Strings;

public class StringReplace {

	public static void main(String[] args) {

		String mystring = "My Name is Ramakanth";

		mystring = mystring.replaceAll("\\s", "  ");
		System.out.println(mystring);
	}

}
