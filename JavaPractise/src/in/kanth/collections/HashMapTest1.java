package in.kanth.collections;

import java.util.HashMap;
import java.util.Map;

import in.kanth.collections.bo.Company;

/**
 * 
 * @author ramakanth.b Why Hashcode and equal method we should override under
 *         collections
 */
public class HashMapTest1 {

	public static void main(String[] args) {
		Company c1 = new Company("emc2");
		Company c2 = new Company("dell");
		Company c3 = new Company("emc2");
		
		System.out.println(c1);
		System.out.println(c3);

		Map<Company, String> compMap = new HashMap<Company, String>();
		compMap.put(c1, "EMC2");
		compMap.put(c2, "DELL");
		compMap.put(c3, "NEW EMC2");
		
		System.out.println(c1);
		System.out.println(c3);

		
		System.out.println(compMap.size());

		/*
		 * StringBuffer/StringBuilder does not override hashCode/equals methods
		 */
		StringBuffer s1 = new StringBuffer("kanth");
		StringBuffer s2 = new StringBuffer("vaishnav");
		StringBuffer s3 = new StringBuffer("kanth");

		Map<StringBuffer, String> buffMap = new HashMap<StringBuffer, String>();
		buffMap.put(s1, "KANTH");
		buffMap.put(s2, "VAISHNAV");
		buffMap.put(s3, "NEW KANTH");

		System.out.println(buffMap.size());   
		
		Map<Object, String> buffMapnew = new HashMap<Object, String>();
		buffMapnew.put(s1.toString(), "KANTH");
		buffMapnew.put(s2, "VAISHNAV");
		buffMapnew.put(s3.toString(), "NEW KANTH");
		System.out.println(buffMapnew.size());   

	}

}
