package in.kanth.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

import in.kanth.collections.bo.Company;

public class MapKeySorting {

	public final static Logger logger = Logger.getLogger(MapKeySorting.class);
	
	public static void main(String[] args) {

		Company c1 = new Company("emc2");
		Company c2 = new Company("dell");
		Company c3 = new Company("vmware");
		Company c4 = new Company("salesforce");
		Company c5 = new Company("microsoft");
		Map<String, Company> beforeMap = new HashMap<>();
		beforeMap.put("D003", c1);
		beforeMap.put("D002", c2);
		beforeMap.put("D001", c3);
		beforeMap.put("D004", c4);
		beforeMap.put("1", c5);
		
		Map<String,Company>  aftermap=new LinkedHashMap<>();
		beforeMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey())
				.forEachOrdered(k->aftermap.put(k.getKey(),k.getValue()));
		
		
		beforeMap = beforeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (old,newva) -> old, LinkedHashMap::new));

		beforeMap.entrySet().stream().forEach(k->logger.info(k.getKey()));
		
	}

}
