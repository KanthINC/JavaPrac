package in.kanth.tricky;

public class RecurssionNumbers {

	public static void main(String[] args) {
		print(10);
	}

	public static void print(int m) {

		if (m > 0) {
			print(m - 1);
			System.out.println(m);
		}
	}

}
