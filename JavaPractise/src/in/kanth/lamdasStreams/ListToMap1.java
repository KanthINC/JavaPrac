package in.kanth.lamdasStreams;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap1 {

	public static void main(String[] args) {
		List<String> mylist = Arrays.asList("first", "second", "third", "fourth", "five", "third", "asfas", "dfgfd",
				"uyy", "234235", "utyur", "34234", "sgfdg", "q3566", "turu", "qwefdsg", "oiotty", "asfasf", "324sdf",
				"6436asf", "35663afs", "uirdtuy", "ueaurery", "baetwte", "rureay");
		Map<String, String> mymap = mylist.stream()
				.collect(Collectors.toMap(String::toString, String::toString, (e1, e2) -> e1));
		// mymap.forEach((k,v)->{
		// System.out.println(k +" ---- "+v);
		// });

		List<Permisson> mylist1 = Arrays.asList(new Permisson("asd", "first", true),
				new Permisson("asd", "second", false), new Permisson("asd", "third", true),
				new Permisson("asd", "fourth", false), new Permisson("asd", "five", true),
				new Permisson("asd", "six", true),new Permisson("asder", "dfgd", true),new Permisson("asd", "wtet", true),new Permisson("asd", "iyttyut", true),new Permisson("asd", "wetwyry", true),new Permisson("asd", "ryuerw", true),new Permisson("asd", "utuqwq", true),new Permisson("asd", "ytitqweret", true),new Permisson("asd", "eruqw", true));

		Long startTime = Instant.now().toEpochMilli();
		Map<String, Boolean> mymap2 = mylist1.stream().filter(s -> mymap.containsKey(s.getFunctionkey()))
				.collect(Collectors.toMap(Permisson::getFunctionkey, Permisson::isHasper, (e1, e2) -> e1));
		mymap2.forEach((k, v) -> System.out.println(k + " " + v));
		Long endTime = Instant.now().toEpochMilli();
		System.out.println(endTime - startTime);

		startTime = Instant.now().toEpochMilli();
		mymap2 = mylist1.parallelStream().filter(s -> mymap.containsKey(s.getFunctionkey()))
				.collect(Collectors.toMap(Permisson::getFunctionkey, Permisson::isHasper, (e1, e2) -> e1));
		mymap2.entrySet().parallelStream()
				.forEach(k -> System.out.println(k ));
		endTime = Instant.now().toEpochMilli();
		System.out.println(endTime - startTime);
	}

}

class Permisson {

	private String pid;
	private String functionkey;
	private boolean hasper;

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getFunctionkey() {
		return functionkey;
	}

	public void setFunctionkey(String functionkey) {
		this.functionkey = functionkey;
	}

	public boolean isHasper() {
		return hasper;
	}

	public void setHasper(boolean hasper) {
		this.hasper = hasper;
	}

	public Permisson(String pid, String functionkey, boolean hasper) {
		super();
		this.pid = pid;
		this.functionkey = functionkey;
		this.hasper = hasper;
	}

}