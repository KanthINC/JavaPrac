package in.kanth.loopings;

import java.util.ArrayList;
import java.util.List;

public class TestEnhancedFor {

	public static void main(String[] args) {
		List<String> testloop=new ArrayList<>();
		
		try{
		testloop.add(null);
		testloop.add(null);
		System.out.println(testloop.size());
		for(String as:testloop){
			System.out.println(as.length());
		}
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
