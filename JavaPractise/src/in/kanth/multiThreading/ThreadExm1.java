package in.kanth.multiThreading;

public class ThreadExm1 {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();

		Thread a1 = new Thread(t1);
		Thread a2 = new Thread(t2);

		a1.start();
		a2.start();

	}

}

class  Thread1 implements Runnable {

	@Override
	public void run() {
		
		for(int i=0;i<50;i++)
		System.out.println("This is Thread1 "+i);

	}

}

class Thread2 implements Runnable {

	@Override
	public void run() {
		for(int i=10;i<100;i++)
		System.out.println("This is Thread2 "+i);

	}

}
