package in.kanth.lamdasStreams;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Stream2Incrementer {

	public static void main(String[] args) {

		List<Employee> emplist = EmployeeList.getEmployeeList();

		int rowindex = 3;
		AtomicInteger counter = new AtomicInteger(0);

		emplist.stream().filter(s -> s.getGender().equals(Gender.FEMALE)).forEach(s -> {

			System.out.println(s.getName() + "  " + (counter.addAndGet(8)));
		});

		System.out.println( counter.get());
		counter.addAndGet(1);
		System.out.println( counter.get());
		
		AtomicInteger counter1 = new AtomicInteger(0);
		
		for(int i=0;i<10;i++){
			if(i==5){
				counter1.addAndGet(1);
			}else{
				counter1.addAndGet(2);
			}
		}
		
		System.out.println("   dssd" +counter1.get()%2);

	}
	

	
}
