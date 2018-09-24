package org.kanth.ocjp.loop.construct;

import java.util.Scanner;

/**
 * provide values for x ,y z so the output should be 1 2 3 4 1 2 3 4 1 2 3 4
 * ---- 1 2 3 4 ----
 * 
 * @author ramakanth.b
 *
 */
public class LTest3 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int z = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please provide values for x,y,z for the required output");
			x = sc.nextInt();
			y = sc.nextInt();
			z = sc.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
		int j = 0;
		int k = 0;
		for (int i = 0; i < x; i++) {

			do {
				k = 0;
				while (k < z) {
					k++;
					System.out.print(k + " ");
				}
				System.out.println(" ");
				j++;
			} while (j < y);
			System.out.println("----");

		}

	}

}
/*
 * ouptut should be 1 2 3 4 
 * 1 2 3 4
 *  1 2 3 4
 *   ------
 *    1 2 3 4 
 *    ------
 */