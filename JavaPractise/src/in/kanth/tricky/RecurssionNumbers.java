package in.kanth.tricky;

public class RecurssionNumbers {

	public static void main(String[] args) {
		RecurssionNumbers obj = new RecurssionNumbers();
		obj.print(3);
	}

	public void print(int m) {

		if (m > 0) {
			print(m - 1);
			System.out.println(m);
		}
	}

}
