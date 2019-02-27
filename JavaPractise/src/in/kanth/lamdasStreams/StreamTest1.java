package in.kanth.lamdasStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import in.kanth.beans.TaxCombine;
import in.kanth.beans.TaxNatureBean;

public class StreamTest1 {

	public static void main(String[] args) {
	
		/*
		 * List<List<TaxCombine>> mynewlist1 = new ArrayList<>(
		 * mytaxcombineList.stream().collect(Collectors.groupingBy(TaxCombine::
		 * getType)).values());
		 * mynewlist1.stream().map(List::size).forEach(System.out::println);
		 */


		List<TaxNatureBean> finalList = new ArrayList<>();
		Map<Integer, TaxNatureBean> mymap = new HashMap<>();

		getTaxCombineList().stream().map(TaxNatureBean::new).collect(Collectors.toList()).stream().forEach(k -> {
			if (mymap.containsKey(k.hashCode())) {
				TaxNatureBean bean = mymap.get(k.hashCode());
				if (k.getNon_monetary() != null && !"".equals(k.getNon_monetary())) {
					bean.setNon_monetary(k.getNon_monetary());
				} else if (k.getTax_nature() != null && !"".equals(k.getTax_nature())) {
					bean.setTax_nature(k.getTax_nature());
				} else if (k.getTax_paid() != null && !"".equals(k.getTax_paid())) {
					bean.setTax_paid(k.getTax_paid());
				}
				mymap.put(k.hashCode(), bean);
			} else {
				mymap.put(k.hashCode(), k);
			}
		});

		finalList = mymap.values().stream().collect(Collectors.toList());
		finalList.sort((TaxNatureBean bean1,TaxNatureBean bean2)->bean1.getPayitemdesc().compareTo(bean2.getPayitemdesc()));
		finalList.stream().forEach(System.out::println);
	}

	public static List<TaxCombine> getTaxCombineList() {
		return Arrays.asList(new TaxCombine("1234", "tax_nature", "Name1", "Yes"),
				new TaxCombine("1234", "non_monetary", "Name1", "No"),
				new TaxCombine("1234", "tax_paid", "Name1", "Yes"),
				new TaxCombine("2234", "tax_nature", "Name2", "Non-Taxable (Report in Appendix A)"),
				new TaxCombine("2234", "non_monetary", "Name2", "No"),
				new TaxCombine("2234", "tax_paid", "Name2", "No"),
				new TaxCombine("3234", "tax_nature", "Name3", "Non-Taxable (Report in Appendix A)"),
				new TaxCombine("3234", "non_monetary", "Name3", "Yes"),
				new TaxCombine("3234", "tax_paid", "Name3", "No"),
				new TaxCombine("4234", "tax_nature", "Name4", "Non-Taxable (Report in Appendix A)"),
				new TaxCombine("4234", "non_monetary", "Name4", "No"),
				new TaxCombine("4234", "tax_paid", "Name4", "No"),
				new TaxCombine("5234", "non_monetary", "Name5", "No"),
				new TaxCombine("5234", "tax_paid", "Name5", "Yes"), new TaxCombine("6234", "tax_paid", "Name6", "No"),
				new TaxCombine("6234", "non_monetary", "Name6", "Yes"));
	}

}
