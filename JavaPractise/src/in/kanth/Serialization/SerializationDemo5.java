
package in.kanth.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author ramak
 * Object Graph
 */
public class SerializationDemo5 {

	/**
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws ClassNotFoundException, IOException {

		A a1 = new A();  //All instances class also should implement  Serializable

		FileOutputStream foo = new FileOutputStream("savetransobj.kanth");
		ObjectOutputStream oos = new ObjectOutputStream(foo);
		oos.writeObject(a1);

		FileInputStream fis = new FileInputStream("savetransobj.kanth");
		ObjectInputStream ois = new ObjectInputStream(fis);
		A a2 = (A) ois.readObject();
		System.out.println(a2.b1.c1.j);

		if (oos != null) {
			oos.close();
		}
		if (ois != null) {
			ois.close();
		}

	}

}

class C implements Serializable {
	int j = 30;
}

class B implements Serializable {
	C c1 = new C();
}

class A implements Serializable {
	B b1 = new B();
}