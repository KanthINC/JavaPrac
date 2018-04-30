package in.kanth.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		BeanTrasStaticFinal a1 = new BeanTrasStaticFinal(); // transient value will ignore original value and save default value by jvm


		FileOutputStream foo = new FileOutputStream("savetransobj.kanth");
		ObjectOutputStream oos = new ObjectOutputStream(foo);
		oos.writeObject(a1);

		FileInputStream fis = new FileInputStream("savetransobj.kanth");
		ObjectInputStream ois = new ObjectInputStream(fis);
		BeanTrasStaticFinal a2 = (BeanTrasStaticFinal) ois.readObject();
		System.out.println(a2);

		if (oos != null) {
			oos.close();
		}
		if (ois != null) {
			ois.close();
		}
	

	
		

	}

}
