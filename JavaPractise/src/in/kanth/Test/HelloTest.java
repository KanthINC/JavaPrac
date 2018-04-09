package in.kanth.Test;

public class HelloTest {

	public static void main(String[] args) {
		System.out.println("My git first");
		System.out.println("New Branch Ramakanth");
		
		int i=2;
		int j=2;
		boolean flag=true;
		while(flag){

		   int temp1=i*i*i;
		   while(i<j){
		   int temp2=j*j;
		   if(temp1==temp2){
			   System.out.println(temp1 +" --- "+temp2);
			   flag=false;
			   break;
			  
		   }
		    j++;
		   }
			i++;
		}
	}

}
