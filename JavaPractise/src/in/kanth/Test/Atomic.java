package in.kanth.Test;

import java.text.DateFormatSymbols;
import java.util.concurrent.atomic.AtomicInteger;

public class Atomic {

	public static void main(String[] args) {
		AtomicInteger y=new AtomicInteger(0);
         System.out.println(y.getAndAdd(1));
         System.out.println(y.getAndAdd(1));
         System.out.println(y.getAndAdd(1));
         
     	String[] monthnames = new DateFormatSymbols().getShortMonths();
     	System.out.println(monthnames[11]);
	}

}
