package in.kanth.lamdasStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import in.kanth.beans.EmpBean;

public class LamdaBreak {

	public static void main(String[] args) {

		List<EmpBean> mylist = getList();
		System.out.println(mylist.size());
	}

	private static List<EmpBean> getList() {

		List<EmpBean> list = new ArrayList<>();
		IntStream.range(1,99).forEachOrdered(i -> {
			if (i == 50)
				return;
		System.out.println(i);
		});

		return list;
	}

}
