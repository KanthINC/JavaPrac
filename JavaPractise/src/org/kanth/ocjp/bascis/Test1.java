package org.kanth.ocjp.bascis;

/**
 * Guess the output
 * @author ramakanth.b
 *
 */
 class A1 {
    public A1(){
    	
    }
    public A1(int m){
    	System.out.print(m);
    }
}

 class Test1{
	 static A1 a1=new A1(1);
	 A1 a2=new A1(2);
	 public static void main(String ... a){
		 new Test1();
		 new A1(3);
	 }
	 static A1 a4=new A1(4);
	 
 }