package in.kanth.Serialization;

import java.io.Serializable;

public class BeanTrasStaticFinal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5563706071539363149L;
	int i = 20;
	transient static int j = 30; // static variables doesn't participate in Serialization as it belongs to class
									// (not objects) , so there is no use in providing transient keyword.
									// the value doesn't change to default
	transient final int k = 40; // final variables cannot be changed even though it is declared transient
								// the value doesn't change to default (no use in transient here)

	public BeanTrasStaticFinal() {
		super();
	System.out.println("BeanTrasStaticFinal new Instance" );
	}

	@Override
	public String toString() {
		return "BeanTrasStaticFinal [i=" + i + ", j=" + j + ", k=" + k + "]";
	}
}
