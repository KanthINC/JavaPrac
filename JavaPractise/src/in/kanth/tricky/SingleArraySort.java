package in.kanth.tricky;

import java.util.Random;

/**
 * Lets say there are random 0's and 1 's in an array
 * arrange the array so that all 0's should come first 
 * then all 1s with out using any pre-dfined method
 * nor using any other arrays
 * @author ramakanth.b
 *
 */
public class SingleArraySort {

	private static final int STARTITEM = 0;
	private static final int RANDOMSIZE=50;

	public static void main(String[] args) {
		int[] nval = new int[20];
		Random rand = new Random();

		for (int i = 0; i < nval.length; i++) {
			nval[i] = rand.nextInt(RANDOMSIZE) % 2;
		}

		System.out.println("before");
		for (int i = 0; i < nval.length; i++) {
			System.out.print(" " + nval[i]);
		}

		for (int i = 0; i < nval.length; i++) {
		
			
			System.out.print("\b");
			if (nval[i] != STARTITEM && i < (nval.length - 1)) {
				int temp1 = nval[i + 1];
				nval[i + 1] = nval[i];
				nval[i] = temp1;
			}

			if (i == (nval.length - 1) && !checkArray(nval, STARTITEM)) {
				i = 0;
			}
		}
		System.out.println();
		System.out.println("after");
		for (int i = 0; i < nval.length; i++) {
			System.out.print(" " + nval[i]);
		}
	}

	private static boolean checkArray(int[] myarray, int startitem) {
		int count = 0;
		for (int i = 0; i < myarray.length; i++) {
			if (myarray[i] != startitem) {
				count++;
			}
			startitem = myarray[i];
			if (count > 1)
				return false;
		}
		return true;
	}

}


/*	nval[0] = 0;
	nval[1] = 1;
	nval[2] = 0;
	nval[3] = 0;
	nval[4] = 1;
	nval[5] = 0;
	nval[6] = 0;
	nval[7] = 0;
	nval[8] = 1;
	nval[9] = 1;
	nval[10] = 1;
	nval[11] = 1;
	nval[12] = 1;
	nval[13] = 1;
	nval[14] = 1;
	nval[15] = 1;
	nval[16] = 1;
	nval[17] = 1;
	nval[18] = 1;
	nval[19] = 1;
*/
