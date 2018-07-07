package in.kanth.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExxampl1 {

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<>();

		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			arrayList.add(i);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken by ArrayList: " + (end - start));
		
		List<Integer> linkedList = new LinkedList<>();
		long start1 = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			linkedList.add(i);
		}
		long end1 = System.currentTimeMillis();
		
		System.out.println("Time taken by LinkedList: " + (end1 - start1));

		List<String> mullist=new ArrayList<>();
		mullist.add("tomcat");
		mullist.add("abc");
		System.out.println(mullist.hashCode());
		mullist=Collections.unmodifiableList(mullist);
		mullist.add("deg");
		System.out.println(mullist.hashCode());
		
		
	}

}
