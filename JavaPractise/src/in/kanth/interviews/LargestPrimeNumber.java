package in.kanth.interviews;

import java.util.Scanner;

public class LargestPrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Kindly enter the Range ");
		int n = sc.nextInt();
		int result = largestprime(n);
		System.out.println(largestprime2(n));
		System.out.println("The Result is " + result);
		sc.close();
	}

	private static int largestprime(int n) {
		int temp = n / 2;
		n = n % 2 == 0 ? n - 1 : n;

		boolean flag = true;
		for (int i = n; i > 0; i -= 2) {
			flag = true;
			for (int j = 2; j < temp; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}

			}

			if (flag) {
				return i;
			}
		}

		return 0;
	}

	private static int largestprime2(int n) {

		int temp = n / 2;
		int result = 0;
		int inste = 0;
		for (int i = 2; i < n; i++) {
			int count = 0;
			for (int j = 2; j < temp; j++) {
				inste++;
				if (i % j == 0) {
					count++;
				}
				if (count > 1) {
					break;
				}

			}
			if (count == 0)
				result = i;
		}
		System.out.println(inste);
		return result;
	}

}
