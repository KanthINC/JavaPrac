package in.kanth.DesginPatterns;

public class MyDoubleton1 {
	
	private static  MyDoubleton1 obj1=null;
	private static  MyDoubleton1 obj2=null;

	private MyDoubleton1(){
		
	}
	
	public static MyDoubleton1 getMyDoubleton1Obj(){
		if(obj1!=null){
			if(obj2==null)
			obj2=new MyDoubleton1();
			if(Math.random()>0.5)
			return obj2;
			else
			return obj1;	
		}
         obj1=new MyDoubleton1();
		return obj1 ;
	}
	
	
}
