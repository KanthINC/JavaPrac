package in.kanth.perform;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;
import java.util.stream.Collectors;

import in.kanth.collections.bo.Employee;

public class LoopIterationandMapping {

	public static void main(String[] args) {

		List<Employee> myList = new ArrayList<>();
		for (int i = 0; i < 9000; i++) {
			myList.add(new Employee("GOO" + i, "E001" + i, "dummy" + i));
		}

		List<String> maillist=myList.stream().map(Employee::getEmail).collect(Collectors.toList());
		
		//maillist.stream().forEach(System.out::println);
		
		getLoopTest(myList);
		System.out.println("****111111");
		myList = new ArrayList<>();
		for (int i = 0; i < 9000; i++) {
			myList.add(new Employee("GO1" + i, "E001" + i, "dummy" + i));
		}
		getLoopTest(myList);
		System.out.println("****222222");
		myList = new ArrayList<>();
		for (int i = 0; i < 9000; i++) {
			myList.add(new Employee("GO2" + i, "E001" + i, "dummy" + i));
		}
		getLoopTest(myList);
		
		System.out.println("****333333");
		myList = new ArrayList<>();
		for (int i = 0; i < 9000; i++) {
			myList.add(new Employee("GO2" + i, "E001" + i, "dummy" + i));
		}
		getLoopTest(myList);
		
	}

	private static void getLoopTest(List<Employee> myList) {
		Map<String, String> formap = new HashMap<>();

		long start = Instant.now().toEpochMilli();

		for (int i = 0; i < myList.size(); i++) {
			Employee tempbean = myList.get(i);
			formap.put(tempbean.getGuid(), tempbean.getEmail());
		}
		long end = Instant.now().toEpochMilli();
		System.out.print("for " + (end - start));
		System.out.println();
		formap = new HashMap<>();

		start = Instant.now().toEpochMilli();
		for (Employee empbean : myList) {
			formap.put(empbean.getGuid(), empbean.getEmail());
		}
		end = Instant.now().toEpochMilli();
		System.out.print(" adv for " + (end - start));
		System.out.println();
		formap = new HashMap<>();
		
		start = Instant.now().toEpochMilli();
		Iterator<Employee> itr=myList.iterator();
		while(itr.hasNext()){
			Employee tempbean = itr.next();
			formap.put(tempbean.getGuid(), tempbean.getEmail());
		}
		end = Instant.now().toEpochMilli();
		System.out.print(" iterator " + (end - start));
		System.out.println();
		formap = new HashMap<>();
		
		
		start = Instant.now().toEpochMilli();
		formap= myList.stream().collect(Collectors.toMap(s->s.getGuid(), s->s.getEmail(),(e1,e2)->e1));
		end = Instant.now().toEpochMilli();
		System.out.print(" stream with lamda " + (end - start));
		System.out.println();
		formap = new HashMap<>();

		start = Instant.now().toEpochMilli();
		formap= myList.stream().collect(Collectors.toMap(Employee::getGuid,Employee::getEmail ,(e1,e2)->e1));
		end = Instant.now().toEpochMilli();
		System.out.print(" stream with method ref " + (end - start));
		System.out.println();
		formap = new HashMap<>();
		
		start = Instant.now().toEpochMilli();
		formap= myList.parallelStream().collect(Collectors.toMap(Employee::getGuid,Employee::getEmail ,(e1,e2)->e1));
		end = Instant.now().toEpochMilli();
		System.out.print("parrle stream with method ref " + (end - start));
		System.out.println();
		formap = new HashMap<>();
	}

}
