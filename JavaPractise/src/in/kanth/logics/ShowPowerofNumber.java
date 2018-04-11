package in.kanth.logics;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @author ramakanth.b 
 * example outputs 
 * 125=5*5*5 -> 3 
 * 36 =6*6 ->2 
 * 256=4*4*4*4=16*16 ->2
 */
public class ShowPowerofNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ShowPowerofNumber s = new ShowPowerofNumber();
		System.out.println("Please enter a number for the power");
		try {
			int n = sc.nextInt();
			int value = 0;
			for (int i = 2; i < n; i++) {

				value = s.getValue(i, 2, n);
				if (value > 0) {
					if (value % 2 == 0 && value > 2) {
						i = s.finalValue(i, value);
						System.out.println("Number is " + i);
						System.out.println("Power is ==" + 2);
					} else {
						System.out.println("Number is ~" + i);
						System.out.println("Power is ~" + value);
					}
					break;
				}

			}
			if (value == 0) {
				System.out.println("Number have no single power function");
			}
			System.out.println("End of program");

		} catch (InputMismatchException e) {
			System.err.println("please provide valid number");
		} catch (Exception e) {
			System.err.println("Problem in getting the power");
		}

		if (sc != null) {
			sc.close();
		}

	}

	public int getValue(int i, int temp, int n) {
		int newtemp = i;
		for (int j = 1; j < temp; j++) {
			newtemp = newtemp * i;
		}
		if (newtemp > n) {
			return 0;
		} else if (newtemp == n) {
			return temp;
		} else {
			temp = getValue(i, ++temp, n);
		}
		return temp;
	}

	public int finalValue(int value, int power) {

		int z = power / 2;
		int tempval = value;
		for (int i = 1; i < z; i++) {
			tempval = tempval * value;
		}
		return tempval;
	}
}
