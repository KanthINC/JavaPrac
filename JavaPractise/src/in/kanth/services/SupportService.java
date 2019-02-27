package in.kanth.services;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import in.kanth.beans.SupportBean;

public class SupportService {

	
	public Map<Integer, SupportBean> getSupportData() {

		return IntStream.range(0, 100000).boxed()
				.collect(Collectors.toMap(Function.identity(), i -> new SupportBean("SU00" + i, "Job" + i)));

	}

}


