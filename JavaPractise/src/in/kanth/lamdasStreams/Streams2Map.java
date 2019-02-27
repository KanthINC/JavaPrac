package in.kanth.lamdasStreams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class Streams2Map {

	public static void main(String[] args) {
		LinkedHashMap<String, List<Employee>> summaryList = new LinkedHashMap<>();
		summaryList.put("1232",
				Arrays.asList(new Employee("kanth", Gender.MALE, 27), new Employee("sanjay", Gender.MALE, 30)));
		summaryList.put("1332",
				Arrays.asList(new Employee("vijay", Gender.MALE, 28), new Employee("pavan", Gender.MALE, 29)));

		summaryList.forEach((k, v) -> {
			v.forEach(s -> {
				s.setName(s.getName().toUpperCase());
			});

		});

		
	}

}
