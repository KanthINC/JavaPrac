package in.kanth.Serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomAccountBean implements Serializable {

	public String question = "What is ur school name?";
	transient public String answer = "BHPV";
	transient public int pin = 1234;

	@Override
	public String toString() {
		return "CustomAccountBean [question=" + question + ", answer=" + answer + ", pin=" + pin + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	// to override default Serialization for wrirting the object
	/**
	 * These are callbacks methods (called by JVM itself)
	 * 
	 * @param oos
	 * @throws IOException
	 */
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject(); // called by default during normal serialization
		String encr = "$23" + answer;
		int encrpin = 444 + pin;
		oos.writeObject(encr);
		oos.writeInt(encrpin);
	}

	// to override default Serialization for reading the object
	/**
	 * 
	 * @param ois
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject(); // called by default during normal deserialization

		String decr = (String) ois.readObject();
		answer = decr.substring(3);
		int decpinf = ois.readInt();
		pin = decpinf - 444;
	}

	public CustomAccountBean() {
		super();
		System.out.println("CustomAccountBean insance created");
	}
}
