package in.kanth.arrays;

public class Array1 {

	public static void main(String[] args) {

		int i[] = { 2 };
		System.out.println(arrValue(i));

	}

	public static int arrValue(int i[]) {
		return i[i.length - 1]++;
	}
}
