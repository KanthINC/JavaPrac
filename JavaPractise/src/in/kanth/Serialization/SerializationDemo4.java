package in.kanth.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo4 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		BeanTrasStaticFinal a1 = new BeanTrasStaticFinal(); // transient value will ignore original value and save
															// default value by jvm
		BeanA a2 = new BeanA();
		BeanTransientA a3 = new BeanTransientA();

		FileOutputStream foo = new FileOutputStream("savetransobj.kanth");
		ObjectOutputStream oos = new ObjectOutputStream(foo);
		oos.writeObject(a1);
		oos.writeObject(a2);
		oos.writeObject(a3);

		FileInputStream fis = new FileInputStream("savetransobj.kanth");

		ObjectInputStream ois = new ObjectInputStream(fis);
		/*
		 * It follows the same order that how you put those objects for Serialization If
		 * the order of retrieving is different then it will cause runtime exceptions
		 */
		BeanTrasStaticFinal ad1 = (BeanTrasStaticFinal) ois.readObject();
		BeanA ad2 = (BeanA) ois.readObject();
		BeanTransientA ad3 = (BeanTransientA) ois.readObject();
		System.out.println(ad1);
		System.out.println(ad2);
		System.out.println(ad3);

		if (oos != null) {
			oos.close();
		}
		if (ois != null) {
			ois.close();
		}
		// if we don't know the order of insertion then use the following

		FileInputStream fvis = new FileInputStream("savetransobj.kanth");

		ObjectInputStream ovis = new ObjectInputStream(fvis);
		while (true) {
			Object o = null;
			try {
				o = ovis.readObject();
			} catch (Exception e) {

			}
			if (o == null) {
				break;
			}

			else if (o instanceof BeanTransientA) {
				System.out.println(o);
			} else if (o instanceof BeanTrasStaticFinal) {
				System.out.println(o);
			} else if (o instanceof BeanA) {
				System.out.println(o);
			}
		}

	}

}
