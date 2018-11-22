package in.kanth.smallprog;

import java.util.Scanner;

public class ReverseofANumber {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			reverse(n);
		}

	}

	public static void reverse(int n) {
		int rev=0;
		while (n > 0) {
          rev=rev*10;
          rev=rev+n%10;
          n=n/10;
		}
		System.out.println(rev);
	}
}
