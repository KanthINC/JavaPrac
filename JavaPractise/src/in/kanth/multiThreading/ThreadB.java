package in.kanth.multiThreading;

import java.util.List;

public class ThreadB implements Runnable {

	@Override
	public void run() {

		for (int i = 30; i <= 50; i++)
			MyArrayList.setMylist(i);
	}

	public void getMyList() {
		for (int i = 0; i < MyArrayList.getMylist().size(); i++) {
			System.out.println("ThreadB ="+MyArrayList.getMylist().get(i));
		}
	}
}
