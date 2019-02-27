package in.kanth.lamdasStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import in.kanth.beans.TaxBean;

public class ListofList2Map {

	public static void main(String[] args) {

		List<List<TaxBean>> getTaxBeanLists =getTaxBeanLists();
		Map<Integer,List<TaxBean>> mymap=getTaxBeanLists.stream().collect(Collectors.toMap(k->k.get(0).hashCode(),Function.identity()));// .collect(Collectors.toMap(TaxBean::hashCode, k->k));
		mymap.forEach((k,v)->{
			v.stream().forEach(x->{
				System.out.println(k+"  "+x);
			});
		});
	}

	public static List<List<TaxBean>> getTaxBeanLists() {

		List<TaxBean> list1 = Arrays.asList(new TaxBean("123", "val1", 58.0), new TaxBean("123", "val1", 59.0),
				new TaxBean("123", "val1", 80.0));
		List<TaxBean> list2 = Arrays.asList(new TaxBean("124", "val2", 68.0), new TaxBean("124", "val2", 77.0),
				new TaxBean("124", "val2", 55.0));
		List<TaxBean> list3 = Arrays.asList(new TaxBean("321", "val3", 11.0), new TaxBean("321", "val3", 22.0),
				new TaxBean("321", "val3", 33.0));
		List<List<TaxBean>> mymainList = new ArrayList<>();
		mymainList.add(list1);
		mymainList.add(list2);
		mymainList.add(list3);
		return mymainList;
	}
}
