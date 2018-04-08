package in.kanth.DesginPatterns;

public class MySingelton2 {
	private  static MySingelton2 myobj=null;
	
	private MySingelton2() {
		System.out.println("new instance created MySingelton2");
	}

	public static MySingelton2 getMyobj() {
		if(myobj==null) {
			myobj= new MySingelton2();
		}
		return myobj;
	}

}
