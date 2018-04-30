package in.kanth.collections;

import java.util.HashMap;
import java.util.Map;

import in.kanth.collections.bo.Company;

public class HashMapTest2 {

	public static void main(String[] args) {

		Company comp11 = null;
		Company comp22 = null;
		Company comp33 = new Company("Pallavi");
		HashMap<Object, String> testmap = new HashMap<Object, String>();

		System.out.println(testmap.put(comp33, "Comp1"));// will return null
															// ,because there is
															// no value before
		System.out.println(testmap.put(comp11, "Comp2"));
		System.out.println(testmap.put(null, "hiii")); // will return the
														// previous value
		System.out.println(testmap.size());
		System.out.println(testmap.get(null));
	}

}
