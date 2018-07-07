package in.kanth.Serialization;

import java.io.Serializable;

public class BeanA implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -106216463767970594L;
	int i=20;
	int j=35;
	@Override
	public String toString() {
		return "BeanA [i=" + i + ", j=" + j + "]";
	}
}
