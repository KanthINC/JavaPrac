package in.kanth.logics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Caching {
	public static int capacity = 5;

	public static void main(String[] args) throws IOException {
		int maintainorder[]=new int[capacity];
		String key = "";

		// Does not work in non-interactive environment (such as in an IDE).
		// key = System.console().readLine()

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a key");
		while (!(key = br.readLine()).equals("N")) {
			System.out.println(key);
			
			
			

			System.out.println("Please enter any key to continue or N to stop");
		}
		System.out.println(" *******  end  *******");
	}
}