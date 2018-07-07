package in.kanth.Serialization;

import java.io.Serializable;

public class BeanTransientA implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1573996457122514896L;
	public BeanTransientA() {
		super();
		System.out.println("BeanTransientA new Instance" );
	}
	int i=10;
	transient int j=20;        //transient only for vairables   ,(transient means dont seralize)
	@Override
	public String toString() {
		return "BeanTransientA [i=" + i + ", j=" + j + "]";
	}
	
}
