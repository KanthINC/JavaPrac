package in.kanth.lamdas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class LamdaExceptionHandling2 {

	public static void main(String[] args) {

		Map<String, List<MyBean>> mydata = getData();

		mydata.forEach(expectionsWrapper((k, v) -> {
			System.out.println(k);
		}));
	}

	public static Map<String, List<MyBean>> getData() {

		Map<String, List<MyBean>> myMap = new HashMap<>();

		myMap.put("relegion", Arrays.asList(new MyBean("hin", "Hindu"), new MyBean("mus", "Muslim")));
		myMap.put("state", Arrays.asList(new MyBean("ap", "Andhra"), new MyBean("kar", "Karnataka")));

		return myMap;
	}

	static <T, U> BiConsumer<T, U> expectionsWrapper(BiConsumer<T, U> throwingConsumer) {

		return (k, v) -> {
			try {
				throwingConsumer.accept(k, v);
			} catch (Exception ex) {
				System.out.println(ex);
			}
		};
	}
}

interface MyFunctional<T, E> {
	void accept(T t, E e);
}

class MyBean {
	private String name;
	private String desc;

	public MyBean(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}