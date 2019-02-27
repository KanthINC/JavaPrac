package in.kanth.hacker;

import java.util.Scanner;

public class LexiString {

	public LexiString() {
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		int n = 0;
		int count = 0;
		StringBuilder x = new StringBuilder();
		if (null != s) {
			n = s.length();

			while (count < n) {

				char max = s.charAt(0);
				if(k>s.length())
					k=s.length();
				for (int i = 1; i < k; i++) {
					if (s.charAt(i) < max) {
						max = s.charAt(i);
					}
				}
				x.append(max);
				s=s.replaceFirst(max+"","");

              count++;
			}
			System.out.println("new one is"+x);
		}

	}




}
