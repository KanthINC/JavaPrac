package in.kanth.logics;

import java.util.Scanner;

/**
 * 
 * @author ramakanth.b
 *
 *         Creatnx now wants to decorate his house by flower pots. He plans to
 *         buy exactly ones. He can only buy them from Triracle's shop. There
 *         are only two kind of flower pots available in that shop. The shop is
 *         very strange. If you buy flower pots of kind 1 then you must pay and
 *         if you buy flower pots of kind 2. Please help Creatnx buys exactly
 *         flower pots that minimizes money he pays.
 * 
 *         Input Format
 * 
 *         The first line contains a integer denoting the number of test cases.
 * 
 *         Each of test case is described in a single line containing three
 *         space-separated integers .
 * 
 *         Output Format
 * 
 *         For each test case, print a single line containing the answer.
 * 
 *         Constraints
 *
 *NOTE: Either fire a blank Scanner.nextLine call after Scanner.nextInt or Scanner.nextFoo to consume rest of that line including newline
 * 
 * 
 */
public class SampleShop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int testcase = sc.nextInt();

		sc.nextLine();
		while (testcase > 0) {

			String[] inputs = sc.nextLine().split(" ");
			long pots = Long.parseLong(inputs[0]);
			long A = Long.parseLong(inputs[1]);
			long B = Long.parseLong(inputs[2]);
			long min = 0;
			for (int i = 0; i < pots; i++) {
				long y = (pots - i);
				long value = (A * (i) * (i)) + (B * y * y);
				if (min == 0) {
					min = value;
				}

				if (value < min) {
					min = value;
				}
			}
			System.out.println("Min value is " + min);
			testcase--;
		}
		sc.close();
	}

}
