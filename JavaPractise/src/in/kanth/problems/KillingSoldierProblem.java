package in.kanth.problems;

import java.util.Scanner;

/**
 * 
 * @author ramakanth.b
 *
 */
public class KillingSoldierProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the no of soldiers in the cricle");
		int n = sc.nextInt();
		String[] intial= new String[n];
		// providing the number to soldiers
		for (int i = 0; i < n; i++) {
			intial[i] = "Soldier -> "+(i + 1);
		}

		System.out.println("The final winner is " + getFinalResult(intial));

		sc.close();
	}

	private static String getFinalResult(String[] intialarry) {
		int intialArryLength = intialarry.length;
		if (intialArryLength == 1)
			return intialarry[0];
		int val = intialArryLength % 2 == 0 ? (intialArryLength / 2) : (intialArryLength / 2) + 1;
		String[] temp = new String[val];

		for (int i = 1, j = 0; i <= intialArryLength; i++) {
			if (i == 1 || i % 2 != 0) {
				temp[j++] = intialarry[i - 1];
			}
		}

		String[] tempclone = temp.clone();
		if (intialarry[intialArryLength - 1] == temp[temp.length - 1]) {
			for (int i = 0; i < temp.length; i++) {
				if (i == 0) {
					temp[i] = tempclone[tempclone.length - 1];
				} else {
					temp[i] = tempclone[i - 1];
				}
			}
		}

		return getFinalResult(temp);

	}

}
