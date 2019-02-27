package in.kanth.Test;

public class SUbString {

	public static void main(String[] args) {
		String a="2018.0";
		String newe=a.indexOf('.')>=0?a.substring(0,a.indexOf('.')):a.substring(0);
		System.out.println(newe);

	}

}
