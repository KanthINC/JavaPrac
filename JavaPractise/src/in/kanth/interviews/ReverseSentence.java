package in.kanth.interviews;

public class ReverseSentence {

	private static String INPUT = "i  want to go to vizag";

	public static void main(String[] args) {
		String inputarr[] = INPUT.split(" ");
		print(inputarr);
	}

	private static void print(String[] inputarr) {
		for (int i = inputarr.length - 1; i >= 0; i--) {
			if (i ==0) {
				System.out.print(inputarr[0]);
			} else {
				System.out.print(inputarr[i] + " ");
			}
		}

	}

}
