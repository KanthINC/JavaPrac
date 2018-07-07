package in.kanth.multiThreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyArrayList {

	private static List<Integer> mylist = new ArrayList<>();

	public static List<Integer> getMylist() {
		return mylist;
	}

	public static void setMylist(Integer listval) {
		mylist.add(listval);
	}

}
