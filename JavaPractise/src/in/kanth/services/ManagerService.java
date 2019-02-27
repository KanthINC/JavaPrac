package in.kanth.services;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import in.kanth.beans.ManagerBean;

public class ManagerService {


	public Map<Integer, ManagerBean> getManagerData() {

		return IntStream.range(0, 100000).boxed()
				.collect(Collectors.toMap(Function.identity(), i -> new ManagerBean("M00" + i, "Desc" + i)));

	}

}


