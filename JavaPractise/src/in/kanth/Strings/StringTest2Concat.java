package in.kanth.Strings;

public class StringTest2Concat {

	public static void main(String[] args) {
		String a1="a"+"b"+"c"+"d";
		int temp=4567890;
		String a2="a"+"b"+"c"+"d"+"a"+"b"+temp+"c"+"d"+"a"+"b"+"c"+"d"+"a"+"b"
		+"c"+"d"+"a"+"b"+"c"+temp+"a"+"b"+"c"+"d"+"a"+"b"+"c"+"d"+"a"+"b"
				+"c"+"d"+"a"+"b"+"c"+temp+"a"+"b"+"c"+"d"+"a"+"b"+"c"+"d";
		String a3="";
		for(int i=0;i<50;i++){
			a3=a3+"i";
		}

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		String aa[]=a1.split("");
	}

}
