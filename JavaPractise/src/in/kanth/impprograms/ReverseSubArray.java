package in.kanth.impprograms;

/**
 * 
 * @author ramakanth.b Desc: Reversing sub Array
 */
public class ReverseSubArray {

	public static void main(String[] args) {
		int[] mysoruce = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int startindex = 0;
		int endindex = 5;

		mysoruce = reversearray(mysoruce, startindex, endindex);

		for (int a : mysoruce) {
			System.out.print(a);
		}

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
