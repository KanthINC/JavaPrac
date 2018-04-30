package in.kanth.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		BeanA a1 = new BeanA(); // if BeanA is not Serializable ,then Exception in thread "main"
								// java.io.NotSerializableException: will appear
								// in runtime

		FileOutputStream foo = new FileOutputStream("saveobj.kanth");
		ObjectOutputStream oos = new ObjectOutputStream(foo);
		oos.writeObject(a1);

		FileInputStream fis = new FileInputStream("saveobj.kanth");
		ObjectInputStream ois = new ObjectInputStream(fis);
		BeanA a2 = (BeanA) ois.readObject();
		System.out.println(a2);

		if (oos != null) {
			oos.close();
		}
		if (ois != null) {
			ois.close();
		}
	}

}
