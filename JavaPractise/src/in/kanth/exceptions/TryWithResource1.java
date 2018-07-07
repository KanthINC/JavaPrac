package in.kanth.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * The resource type file should implement java.lang.AutoCloseable 
 * Not required to manually close the resource
 * 
 * @author ramakanth.b
 *
 */
public class TryWithResource1 {

	public static void main(String[] args) {

		// try(Class.forName("in.kanth.collections.bo.Company")){ //The resource
		// type File does not implement java.lang.AutoCloseable
		try (BufferedReader reader1 = new BufferedReader(new FileReader("journaldev.txt"))) {
			System.out.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
