package in.kanth.services;

import java.util.ArrayList;
import java.util.List;

import in.kanth.collections.bo.Employee;

public class DetailListService {

	public List<Employee> getmyDetailList(){
		
		List<Employee> mylist=new ArrayList<>();
		
		for(int i=0;i<20000;i++){
			mylist.add(new Employee("GU"+i,"EM"+i,"Mail"+i));
		}
		
		return mylist;
	}
	
}
