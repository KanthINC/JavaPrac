package in.kanth.smallprog;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fabonacii {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			System.out.println("1st Way");
			fabonacii1(n);
			System.out.println("2nd Way");
			fabonacii2(n);
		}

	}

	public static void fabonacii1(int n) {

		int a = 0, b = 0, c = 1;
		System.out.println(0);
		System.out.println(1);
		for (int i = 0; i < n - 2; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(c);
		}
	}

	public static void fabonacii2(int n) {

		Stream.iterate(new int[] { 0, 1 }, s -> new int[] { s[1], s[0] + s[1] }).limit(n).map(p -> p[0])
				.collect(Collectors.toList()).stream().forEach(System.out::println);
	}

}
