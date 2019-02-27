package in.kanth.lamdas;

/**
 * Type inference
 * @author ramakanth.b
 *
 */
public class LamdaThree {

	public static void main(String[] args) {
		
		//Captial c=(String s)->s.toUpperCase();  - no need to mention the input type as it functional ,only 1 method javac knows it 

		Captial c=s->s.toUpperCase();  //() also not nessesary as only 1 input
		System.out.println(c.convertUpperCase("hello"));
	}

}

interface Captial{
	String convertUpperCase(String input);
}