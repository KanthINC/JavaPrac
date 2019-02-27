package in.kanth.Test;

import java.io.IOException;
import java.io.InputStream;



public class WHilee {

	public static void main(String[] args) throws IOException {
		
		String ab="kanth";
	    String temp=ab.substring(4,5);
	    System.out.println(ab.replace(temp, ""));
	    System.out.println(temp);
	}

}
