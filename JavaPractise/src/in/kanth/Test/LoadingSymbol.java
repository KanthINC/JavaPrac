package in.kanth.Test;

public class LoadingSymbol {

	public static void main(String[] arg) throws Exception {
		String anim = "|/-\\";
		for (int x = 0; x < 100; x++) {
			String data = "\r" + anim.charAt(x % anim.length());
			//System.out.print("\033[H\033[2J");
//			System.out.write(data.getBytes());
			System.out.println(data);
			Thread.sleep(100);

		}
	}

}
