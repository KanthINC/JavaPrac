package in.kanth.lamdas;

public class LamdaSecond {

	public static void main(String[] args) {

		int a = 10;

		MyFuncInterf2 m1 = () -> {
			// int a=10;
			System.out.println("This is tommy " + a);
		};

		MyFuncInterf2 m2 = new MyFuncInterf2() {

			int a = 20;

			@Override
			public void myName() {
				System.out.println("This is apache " + a);

			}

		};
		
		m1.myName();
		m2.myName();

		// now u r not implementing an class but u got the same result ,,so is
		// both same
		// No ..they r not same
	}
}

interface MyFuncInterf2 {

	void myName();
}