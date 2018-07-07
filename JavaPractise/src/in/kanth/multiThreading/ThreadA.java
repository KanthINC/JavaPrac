package in.kanth.multiThreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadA implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			MyArrayList.setMylist(i);
		}
		getMyList();
	}

	public void getMyList() {
		List<Integer> list= Collections.synchronizedList(MyArrayList.getMylist());
		synchronized (list) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println("ThreadA =" + MyArrayList.getMylist().get(i));
			}
		}
	}
}
