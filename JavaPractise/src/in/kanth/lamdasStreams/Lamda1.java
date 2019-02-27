package in.kanth.lamdasStreams;

import java.util.Arrays;
import java.util.List;

public class Lamda1 {

	public static void main(String[] args) {
		
		List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		
		for(int i=0;i<num.size();i++){
			System.out.println(num.get(i));
		}
		
		System.out.println("************");
		
		for(Integer in:num){
			if(in%2==0)
				System.out.println(in*2);
			
		}
		System.out.println("************");
		num.stream().filter(e->e%2==0).map(e->e*2).forEach(System.out::println);

	}

}
