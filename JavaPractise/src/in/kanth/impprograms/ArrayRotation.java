package in.kanth.impprograms;

/**
 * 
 * @author ramakanth.b Desc: Rotate array
 * 
 */
public class ArrayRotation {

	public static void main(String[] args) {
		int[] mysoruce = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int noofrotations = 1;
		noofrotations = finalroations(mysoruce.length, noofrotations);
		reversearray(mysoruce, 0, (mysoruce.length - noofrotations - 1));
		reversearray(mysoruce, mysoruce.length - noofrotations, mysoruce.length - 1);
		reversearray(mysoruce, 0, mysoruce.length - 1);
		for (int a : mysoruce) {
			System.out.print(a);
		}

	}

	public static int finalroations(int arrlength, int noofrotations) {
		if (arrlength < noofrotations) {
			noofrotations = noofrotations % arrlength;
		}

		return noofrotations;

	}

	private static int[] reversearray(int[] mysoruce, int startindex, int endindex) {
		if (startindex > endindex || endindex > mysoruce.length)
			throw new IllegalArgumentException();

		while (startindex < endindex) {
			int temp = mysoruce[endindex];
			mysoruce[endindex] = mysoruce[startindex];
			mysoruce[startindex] = temp;
			startindex++;
			endindex--;
		}

		return mysoruce;
	}
}
