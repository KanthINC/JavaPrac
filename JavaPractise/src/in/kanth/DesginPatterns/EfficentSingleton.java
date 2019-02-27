package in.kanth.DesginPatterns;

public class EfficentSingleton {

	private static volatile EfficentSingleton lazysingelton = null;

	private EfficentSingleton() {

	}

	public static EfficentSingleton getEfficentSingeltonObj() {

		if (lazysingelton == null) {
			synchronized (EfficentSingleton.class) {
				if (lazysingelton == null) {
					lazysingelton = new EfficentSingleton();
				}
			}
		}

		return lazysingelton;
	}

}
