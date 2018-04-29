package in.kanth.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * We can serialize the sub class without implementing Serializable in parent class
 * NOTE:parent class should contain default constructor
 * while saving in the file ,varables in the super class value is assigned to default (i.e 0 for int )
 * while deserialize it will create new parent class object 
 * for all parent classes which are non serialize  ,jvm will execute instance control flow 
 * @author ramak
 *
 */
public class SerializationInheritence2 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
  

		BB b1=new BB();
		b1.i=60;   //modsuper class value modifing the parent class value 
		b1.j=70;    
		FileOutputStream foo = new FileOutputStream("inh.kanth");
		ObjectOutputStream oos = new ObjectOutputStream(foo);
		oos.writeObject(b1);
		System.out.println(b1);

		FileInputStream fis = new FileInputStream("inh.kanth");
		ObjectInputStream ois = new ObjectInputStream(fis);
		BB b2 = (BB) ois.readObject();
		System.out.println(b2);

		if (oos != null) {
			oos.close();
		}
		if (ois != null) {
			ois.close();
		}

	}

}

class AA {
	@Override
	public String toString() {
		return "AA [i=" + i + "]";
	}

	public AA() {
		super();
		System.out.println("AA new instance i ="+i);
	}



	int i=30;
}

class BB extends AA implements Serializable{
	public BB() {
		super();
		System.out.println("BB new instance");
	}

	@Override
	public String toString() {
		return "BB [j=" + j + "]";
	}

	int j=40;
}