package in.kanth.sql;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.joining;

public class WhereINPara {

	public WhereINPara() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<String> abc = Arrays.asList("Ramakanth", "Sanjay", "Vijay", "Pavan");

		List<Integer> def=Arrays.asList(6,7,8,4);
		String result = getString(abc);
		System.out.println(result);
	}

	private static <T> String getString(List<T> abc) {

		return abc.stream().map(s -> new StringBuilder("'").append(s).append("'")).collect(joining(","));
	}

}
