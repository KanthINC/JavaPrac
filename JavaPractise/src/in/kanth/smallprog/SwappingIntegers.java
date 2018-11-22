package in.kanth.smallprog;

import java.util.Scanner;

public class SwappingIntegers {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			swap(a, b);
		}

	}

	private static void swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);
	}

}
