package in.kanth.Test;

import java.util.HashSet;
import java.util.Iterator;

public class GetConcurrentException {

	public static void main(String[] args) {

		HashSet<String> duu = new HashSet<>();

		for (int i = 0; i < 20; i++) {
			duu.add("anusha beauty increment" + i);
		}

		Iterator<String> it=duu.iterator();
		while(it.hasNext()){

				duu.remove("anusha beauty increment5");

			
		}
		
		System.out.println("DONE");
	}

}
