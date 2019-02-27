package in.kanth.lamdasStreams;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.*;
import java.util.stream.Collectors;

import in.kanth.collections.bo.Employee;

public class ListCompare2List {

	public static void main(String[] args) {
		List<Employee> myList = new ArrayList<>();
		for (int i = 0; i < 200; i++) {
			myList.add(new Employee("GOO" + i, "E001" + i, "dummy" + i));
		}
//
//		List<String> guids = new ArrayList<>();
//		for (int i = 0; i < 300; i++) {
//			if (i % 192 != 0)
//				guids.add("GOO" + i);
//		}

		// guids.stream().forEach(System.out::println);

		long start = 0l;
		long end = 0l;

		start = Instant.now().toEpochMilli();
		Map<String, Employee> mymap1 = myList.stream()
				.collect(Collectors.toMap(s -> s.getGuid() + s.getEmpid(), Function.identity(), (s1, s2) -> s1));

		end = Instant.now().toEpochMilli();
		System.out.println("seq " + (end - start));
		System.out.println(start + "           " + end);
		
		
		
		start = Instant.now().toEpochMilli();
		Map<String, Employee> mymap2 = myList.stream()
				.collect(Collectors.toMap(s -> s.getGuid() + s.getEmpid(), Function.identity(), (s1, s2) -> s1));

		end = Instant.now().toEpochMilli();
		System.out.println("seq " + (end - start));
		System.out.println(start + "           " + end);
		
		start = Instant.now().toEpochMilli();
		Map<String, Employee> mymap = myList.parallelStream()
				.collect(Collectors.toMap(s -> s.getGuid() + s.getEmpid(), Function.identity(), (s1, s2) -> s1));

		end = Instant.now().toEpochMilli();
		System.out.println("parallel " + (end - start));
		System.out.println(start + "           " + end);


	
		// System.out.println(myList.stream().map(Employee::getGuid).allMatch(guids::contains));

		// num -> guids.contains(num)
	}

}
