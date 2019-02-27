package in.kanth.read;

import java.util.Scanner;

public class ReadCommandArg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the data with spaces");
		String read = sc.nextLine();
		String readspace[] = read.split(" ");
		for (int i = 0; i < readspace.length; i++) {
			System.out.println(readspace[i]);
		}
		if (null != sc)
			sc.close();
	}

}
