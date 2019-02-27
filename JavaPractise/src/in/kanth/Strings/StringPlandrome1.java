package in.kanth.Strings;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

import in.kanth.lamdasStreams.Streams2Map;

public class StringPlandrome1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter the Text to check");
			String name = sc.next();
			System.out.println("Enter the number to cut from the string");
			Integer n = sc.nextInt();
			System.out.println(checkPalndrome(name));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static boolean checkPalndrome(String input) {
		AtomicInteger count = new AtomicInteger(0);
		
		IntStream.range(0, input.length()).forEach(k -> {
			String check=input.substring(k);
			System.out.println("check is "+check);
			check=(check.length()<input.length())?input.substring(0, k)+input.substring(k, input.length()):input.substring(k);
			System.out.println(check);
			if (new StringBuffer(check).reverse().equals(check)) {
			
				count.addAndGet(1);
			}
		});
		return count.get() > 0;
	}
}
