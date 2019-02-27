package in.kanth.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsInLists {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("satish", "harish", "srinu", "eshwar", "umakanth", "phani");
		List<String> list2 = Arrays.asList("srinu", "harish", "phani", "stanley");
		List<String> list3 = Arrays.asList("harish", "umakanth", "srinu", "pavan", "sanjay");

		List<String> finalList = list1.stream().filter(list2::contains).filter(list3::contains)
				.collect(Collectors.toList());
		finalList.stream().forEach(System.out::println);
	}

}
