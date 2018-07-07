package in.kanth.multiThreading;

public class TMultiThreadCheck {

	public static void main(String[] args) {
		ThreadA a1=new ThreadA();
        ThreadB b1=new ThreadB();
		Thread a=new Thread(a1);
		Thread b=new Thread(b1);
		a.start();	
		b.start();
//		a1.getMyList();
	}

}
