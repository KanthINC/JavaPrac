package in.kanth.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * if a parent call implement Serializable ,then child class by default implement Serializable
 *
 * NOTE:Object class doesn't implement Serializable as every class is a sub class of Object class and need not Serializable
 * GenericServlet implements Serializable  ,so all servlet classes are Serializable
 *  @author ramakanth
 */
public class SerializationInheritence1 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		D b1 = new D();
		FileOutputStream foo = new FileOutputStream("inh.kanth");
		ObjectOutputStream oos = new ObjectOutputStream(foo);
		oos.writeObject(b1);
		System.out.println(b1);

		FileInputStream fis = new FileInputStream("inh.kanth");
		ObjectInputStream ois = new ObjectInputStream(fis);
		D b2 = (D) ois.readObject();
		System.out.println(b2);

		if (oos != null) {
			oos.close();
		}
		if (ois != null) {
			ois.close();
		}

	}

}

class E implements Serializable {
	int i = 30;
	public E() {
		super();
		System.out.println("  E  new instance ");
	}

	int j = 40;

	@Override
	public String toString() {
		return "E [i=" + i + ", j=" + j + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}

class D extends E {
	int i = 40;
	int j = 50;

	@Override
	public String toString() {
		return "D [i=" + i + ", j=" + j + "]";
	}

	public D() {
		super();
		System.out.println("  D new instance ");
	}

}