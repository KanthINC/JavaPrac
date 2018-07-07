package in.kanth.DesginPatterns;

public class TestSingelton {

	public static void main(String[] args) {
	//	MySingelton1 m1=new MySingelton1();
		MySingelton1 m1=MySingelton1.getMyobj();
		System.out.println(m1);
		MySingelton1 m2=MySingelton1.getMyobj();
		System.out.println(m2);
		
		MySingelton2 m21=MySingelton2.getMyobj();
		System.out.println(m21);
		MySingelton2 m22=MySingelton2.getMyobj();
		System.out.println(m22);
		


		
		//check doubelton
		
		MyDoubleton1 obj1=MyDoubleton1.getMyDoubleton1Obj();
		MyDoubleton1 obj2=MyDoubleton1.getMyDoubleton1Obj();
		MyDoubleton1 obj3=MyDoubleton1.getMyDoubleton1Obj();
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}

}
