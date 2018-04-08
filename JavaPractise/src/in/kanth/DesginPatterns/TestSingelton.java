package in.kanth.DesginPatterns;

import java.util.HashMap;
import java.util.Map;

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
		
		Map<String,String> mm=new HashMap<String, String>();

	}

}
