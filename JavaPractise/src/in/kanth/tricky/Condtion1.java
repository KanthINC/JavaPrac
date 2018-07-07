package in.kanth.tricky;

public class Condtion1 {

	public static void main(String[] args) {
		Object o1=null;
		if(true){
			o1=new Integer(1);
		}else{
			o1=new Double(2.0);
		}

		Object o2=true? new Integer(1):new Double(2.0);
		System.out.println(o1);
		System.out.println(o2);
	}

}
