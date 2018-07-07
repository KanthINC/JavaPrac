package in.kanth.multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CheckArraylistSYnc {

	private static ExecutorService executor = null;
	private static volatile Future taskOneResults = null;
	private static volatile Future taskTwoResults = null;
	public static void main(String[] args) throws Exception {
		executor = Executors.newFixedThreadPool(2);
          ThreadA a1=new ThreadA();
          ThreadB b1=new ThreadB();
          checkTasks(a1,b1);
          a1.getMyList();
/*          for(int i=0;i<a1.getList().size();i++){
        	  System.out.println(a1.getList().get(i));
          }
          System.out.println("***************************");
          for(int i=0;i<b1.getList().size();i++){
        	  System.out.println(b1.getList().get(i));
          }
          System.out.println("*****=========*********************");
      
//          System.out.println(b1.getList().size());
*///          System.out.println(MyArrayList.getMylist().size());
	}
	
	private static void checkTasks(ThreadA a1,ThreadB b1) throws Exception {
		if (taskOneResults == null
				|| taskOneResults.isDone()
				|| taskOneResults.isCancelled())
		{
			taskOneResults = executor.submit(a1);
		}

		if (taskTwoResults == null
				|| taskTwoResults.isDone()
				|| taskTwoResults.isCancelled())
		{
			taskTwoResults = executor.submit(b1);
		}
	}

}
