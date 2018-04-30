package in.kanth.bitwise;

public class BitwiseOperations1 {

	public static void main(String[] args) {
      int a1=15;
      int b1=27;
      int d1=35;
      bitwiseOR(a1,b1);
      bitwiseAND(a1,b1);
      bitwiseCompliement(a1);
      bitwiseCompliement(d1);
	}
	
	/**
	 * 
	 * @param a1
	 * @param b1
	 * a1  =  0 0 0 0 1 1 1 1
       b1  =  0 0 0 1 1 0 1 1
   
       c1  =  0 0 0 1 1 1 1 1 
	 */
	public static void bitwiseOR(int a1,int b1){
		int c1=a1|b1;
		System.out.println("Bitwise OR -> "+c1);
	}

	/**
	 * 
	 * @param a1
	 * @param b1
	 * a1  =  0 0 0 0 1 1 1 1
       b1  =  0 0 0 1 1 0 1 1
   
       c1  =  0 1 0 1 1   
	 */
	public static void bitwiseAND(int a1,int b1){
		int c1=a1&b1;
		System.out.println("Bitwise AND ->"+c1);
	}
	/**
	 * 
	 * @param a1
	 * a1  =0 1 1 1 1
	 * 
	 * c1  =1 0 0 0 0
	 */
	public static void bitwiseCompliement(int a1){
		int c1=~a1;
		System.out.println("Bitwise Compliment ->"+c1);
	}
	
}
