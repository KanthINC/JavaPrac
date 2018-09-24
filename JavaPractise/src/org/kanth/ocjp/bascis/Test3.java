package org.kanth.ocjp.bascis;

import static java.lang.System.out;

/**
 * static block vs instanace block vs constructor 
 * @author ramakanth.b
 *
 */
public class Test3 {

	{
		out.println("Empty block");
	}
	static {
		out.println("static  block");
	}
	Test3(){
		System.out.println("This is const");
	}
	public static void main(String... args) {
		new Test3();
	}
  
}
