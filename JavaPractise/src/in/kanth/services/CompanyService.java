package in.kanth.services;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import in.kanth.beans.CompBean;

public class CompanyService {

	public Map<Integer, CompBean> getCompanyData() {

		return IntStream.range(0, 100000).boxed()
				.collect(Collectors.toMap(Function.identity(), i -> new CompBean("C00" + i, "Name" + i)));

	}

}
 