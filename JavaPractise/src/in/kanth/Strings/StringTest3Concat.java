package in.kanth.Strings;

import java.util.Arrays;
import java.util.List;

public class StringTest3Concat {

	public static void main(String[] args) {
	
		String s1="rama";
		String s2="kanth";
		System.out.println(String.join("-",s1,s2));
		
		List<String> fruits=Arrays.asList("apple","mango","banana","tomato");
		System.out.println(String.join("-",fruits));

	}

}
