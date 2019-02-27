package in.kanth.lamdasStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InstreamtoList {

	public static void main(String[] args) {
		List<String> mylist = mylist();
		List<String> newList = new ArrayList<>();
		newList = IntStream.range(0, mylist.size()).mapToObj(i -> mylist.get(i)).collect(Collectors.toList());
		newList.stream().forEach(System.out::println);
	}

	public static List<String> mylist() {
		return Arrays.asList("Sanjay", "Raju", "Anil", "Kanth");
	}

}
