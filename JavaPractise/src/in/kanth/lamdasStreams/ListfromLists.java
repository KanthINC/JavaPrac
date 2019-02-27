package in.kanth.lamdasStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListfromLists {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();

		List<String> list2 = Arrays.asList("Kanth", "Sanjay", "Anil", "Raju");
		List<String> list3 = new ArrayList<>();
		List<String> list4 = Arrays.asList("Hema", "Meow", "Pilli");

		List<List<String>> allList = new ArrayList<>();
		allList.add(list1);
		allList.add(list2);
		allList.add(list3);
		allList.add(list4);
		

	}

}
