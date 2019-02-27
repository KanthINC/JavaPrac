package in.kanth.services;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import in.kanth.beans.EmpBean;

public class EmployeeService {

	public Map<Integer, EmpBean> getEmployeeData() {

		return IntStream.range(0, 100000).boxed()
				.collect(Collectors.toMap(Function.identity(), i -> new EmpBean("E00" + i, "U00" + i)));

	}

}

