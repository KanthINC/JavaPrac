package in.kanth.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapIterate {

	public static void main(String[] args) {

		Map<String, Integer> map1 = getMapValues();
		Map<String, Integer> map=new HashMap<>();

		
		//map1=map1.entrySet().stream().collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));
		
		
		//modified
      map.forEach((k, v) -> {
			
			System.out.println(k + "====" + v);
		});
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		//iterate 2
		
	for(Map.Entry<String,Integer> ent:map1.entrySet()){
		System.out.println(ent.getKey()+"====="+ent.getValue());
	}
	
	
	
	  System.out.println("JDBC Query help=-------------");
	  
	  List<HashMap<String, Object>> listval=getListMapValues();
	  HashMap<String, Object>  paymap=new HashMap<String, Object> ();
	  
	  listval.forEach(paymap::putAll);
 
	  paymap.forEach((k,v)-> {
		    System.out.println( k+ "   "+v);
	   });
	     
	}

	private static Map<String, Integer> getMapValues() {
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("sanjay", 32);
		map1.put("manoj", 45);
		map1.put("vijay", 80);
		map1.put("stanley", 34);
		map1.put("meow", 28);
		map1.put("anil", 40);
		map1.put("kanth", 52);
		return map1;
	}

	private static List<HashMap<String, Object>> getListMapValues() {

		List<HashMap<String, Object>> obj = new ArrayList<HashMap<String, Object>>();

		HashMap<String, Object> mp1 = new HashMap<String, Object>();
		mp1.put("1", "kanth");
		obj.add(mp1);
		HashMap<String, Object> mp2 = new HashMap<String, Object>();
		mp2.put("2", "sanjay");
		obj.add(mp2);
		HashMap<String, Object> mp3 = new HashMap<String, Object>();
		mp2.put("3", "hema");
		obj.add(mp3);

		return obj;

	}
	
	/*s*/
}
