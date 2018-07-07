package in.kanth.algorithms;

import java.util.Scanner;

public class BinarySearchAlgo {

	public static void main(String[] args) {

		int numarr[] = getSortedArray();
		System.out.println("Please provide the number to check the index");
		Scanner sc = new Scanner(System.in);
		int n = 0;
		try {
			n = sc.nextInt();
		} catch (Exception e) {
			System.err.println("Please provide proper input");
		}
		int position = getIndexfromBinarySearch(numarr, n);
		System.out.println("The postion for the number " + n + "is " + position);
		
		if(null!=sc)
			sc.close();
	}

	private static int getIndexfromBinarySearch(int[] numarr, int n) {

		int start = 0;
		int end = numarr.length - 1;

		int midelement = 0;
		while (start <= end) {
			midelement = start+(end -start) / 2;
			if (numarr[midelement] == n) {
				return midelement;
			} else if (numarr[midelement] > n) {
				end = midelement-1;
			} else  {
				start = midelement+1;
			}
			System.out.println(start+" "+end+" "+midelement);
		}

		return -1;
	}

	private static int[] getSortedArray() {
		int arr[] = { 1, 2, 3, 9, 18, 25, 38, 41, 48, 52, 57, 63, 67, 71, 79, 80, 85 };
		return arr;
	}

}
