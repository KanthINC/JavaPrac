package in.kanth.hacker;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int q = 0;
		int qline[] = null;
		String read[] = new String[n];
		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

			read = bufferedReader.readLine().split(" ");
			for (int i = 0; i < read.length; i++) {
				a[i] = Integer.parseInt(read[i]);
			}
			q = sc.nextInt();
			qline = new int[q];
			for (int i = 0; i < q; i++) {
				qline[i] = sc.nextInt();
			}
		} catch (Exception e) {
e.printStackTrace();
		}

		sortArray(n, a);

		for (int i = 0; i < q; i++) {
			double k = qline[i];
			double x = 0;
			int result = 0;
			for (int j = 1; j <=n; j++) {
				double avg = (x + a[j-1]) / (j);
				x=x+a[j-1];
				if (avg >=k)
					break;

				result = j ;
			}
			System.out.println(result);
		}

	}

	private static void sortArray(int n, int[] a) {
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

}
