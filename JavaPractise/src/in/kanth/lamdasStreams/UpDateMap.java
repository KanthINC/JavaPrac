package in.kanth.lamdasStreams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class UpDateMap {

	public static void main(String[] args) {
		Map<String, Integer> mymap = new HashMap<>();
		IntStream.range(0, 100).forEach(i -> putMapVal(i,"val"+i,mymap));
		mymap.entrySet().forEach(e->System.out.println(e.getValue()));
	}

	
	 private static  void putMapVal(int i,String val,Map<String,Integer> mymap){
		 mymap.put(val,i);
	 }
}
