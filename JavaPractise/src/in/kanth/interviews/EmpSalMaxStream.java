package in.kanth.interviews;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class EmpSalMaxStream {

	public static void main(String[] args) {

		List<EmpSal> empList = getEmpSal();

		Optional<EmpSal> result = empList.stream().reduce((e1, e2) -> e1.getSal() > e2.getSal() ? e1 : e2);
		System.out.println(result.get().getName());
	}

	private static List<EmpSal> getEmpSal() {

		return Arrays.asList(new EmpSal("teju", "902", 30000.00), new EmpSal("tomcat", "903", 40000.00),
				new EmpSal("darshan", "905", 80000.00), new EmpSal("palu", "908", 34000.00));
	}

}
