package in.kanth.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource2 {

	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader reader1 = new BufferedReader(new FileReader("journaldev.txt"));
		// try(reader1){ //Not acceptable in java 7 and Java8 but it will work
		// in Java 9
		try (BufferedReader reader = reader1) {     

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
