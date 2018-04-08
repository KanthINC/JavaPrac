package in.kanth.DesginPatterns;

public class MySingelton1 {

	private final static  MySingelton1 myobj =new MySingelton1();
	
	private MySingelton1() {
	}

	public static MySingelton1 getMyobj() {
		return myobj;
	}
	
	
}

