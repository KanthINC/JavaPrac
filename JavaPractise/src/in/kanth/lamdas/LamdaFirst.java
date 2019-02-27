package in.kanth.lamdas;

public class LamdaFirst {

	public static void main(String[] args) {
		
		
		MyFunctionalInterface func=new MyFunctionalInterfaceImpl();
		
		//This will act as implementation to the merhod printnamme but not exactly
		MyFunctionalInterface funmethod=()->System.out.println("Tommy");
		

		func.printName();
		funmethod.printName();
	}

}


interface MyFunctionalInterface{
   public void printName();	 //signautre of this method will use in lamda expreesion 
}

class MyFunctionalInterfaceImpl implements MyFunctionalInterface {

	@Override
	public void printName() {
		System.out.println("tomcat");
		
	}
	
}