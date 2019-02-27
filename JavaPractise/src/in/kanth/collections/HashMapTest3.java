package in.kanth.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import in.kanth.collections.bo.Employee;

public class HashMapTest3 {

	public static void main(String[] args) {

		List<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee("1111", "em111", "babc@gmail.com"));
		emplist.add(new Employee("2222", "em121", "gfd@gmail.com"));
		emplist.add(new Employee("2222", "em121", "tit@gmail.com"));
		emplist.add(new Employee("444", "em114", "jkgkg@gmail.com"));

		Map<String, Employee> getMyMap = emplist.stream()
				.collect(Collectors.toMap(s -> s.getGuid() + s.getEmpid(), Function.identity()));

	
		getMyMap.forEach((k,v)->{
			System.out.println(k+"  "+v);
		});
	}

}
