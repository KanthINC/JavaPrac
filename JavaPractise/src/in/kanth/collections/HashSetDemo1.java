package in.kanth.collections;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {

		HashSet<String> s1 = new HashSet<String>();
		s1.add("no1"); // internally map.put(e, new Object()) -uses hashmap
		System.out.println(s1.add("no1")); // If this set already contains the element, the call leaves the set
											// unchanged and returns {@code false}.
		
		s1.add("no2");
		s1.add("no3");
		s1.add("no4");
		System.out.println(s1);
		
		for(String s:s1) {
			System.out.println(s);
		}
		
	}

}
