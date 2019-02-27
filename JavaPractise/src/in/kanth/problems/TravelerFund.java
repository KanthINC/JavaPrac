package in.kanth.problems;

import java.util.Scanner;

public class TravelerFund {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("KIndly enter the size of an array");
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter the value for the day " + (i + 1));
				arr[i] = sc.nextInt();
			}

			System.out.println("Ur starting value must be min " + calculate(arr));
		}

	}

	public static int calculate(int arr[]) {
		boolean flag = false;
		int finalvalue = 0;
		for (int i = 0; i < 10; i++) {
			int temp = 0;
			for (int j = 0; j < arr.length; j++) {
				if(j==0) temp=temp + i + arr[j];
				else temp = temp+ arr[j];
				if (temp < 0)
					break;
				if (((arr.length - 1) == j) & temp >= 0) {
					flag = true;
					finalvalue = i;
				}
			}
			if (flag)
				break;
		}

		return finalvalue;
	}

}
