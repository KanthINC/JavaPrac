package in.kanth.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomSerialization1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {


		CustomAccountBean a1 = new CustomAccountBean();  
		System.out.println(a1);

		FileOutputStream foo = new FileOutputStream("custom.kanth");
		ObjectOutputStream oos = new ObjectOutputStream(foo);
		oos.writeObject(a1);

		FileInputStream fis = new FileInputStream("custom.kanth");
		ObjectInputStream ois = new ObjectInputStream(fis);
		CustomAccountBean a2 = (CustomAccountBean) ois.readObject();
		System.out.println(a2);

		if (oos != null) {
			oos.close();
		}
		if (ois != null) {
			ois.close();
		}

	

	}

	public CustomSerialization1() {
		super();
		System.out.println("CustomSerialization1 instnace");
	}

}
