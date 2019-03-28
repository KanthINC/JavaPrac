package in.kanth.exception;

public class FinallyCheck {

	public static void main(String[] args) {

		int n = getNumber();
		System.out.println(n);
		int s=show();
		System.out.println(s);
	}

	private static int getNumber() {
		try {
			return 1;
		} finally {
			return 2;
		}
	}

	static int show(){
        try{
            throw new NullPointerException();
        }
        finally{
            return 2;
        }
}
	
	
}
