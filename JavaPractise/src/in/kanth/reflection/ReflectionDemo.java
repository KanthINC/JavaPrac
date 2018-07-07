package in.kanth.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import in.kanth.DesginPatterns.MySingelton1;
import in.kanth.DesginPatterns.MySingelton2;

public class ReflectionDemo {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {

	//	Class c = Class.forName("Hello");  -this will not work
		Class c = Class.forName("in.kanth.reflection.Hello");
		@SuppressWarnings("deprecation")
		Hello h = (Hello) c.newInstance();
		Method m = c.getDeclaredMethod("fun1", null);
		m.setAccessible(true);
		m.invoke(h, null);
		
	/*	Class d=Class.forName("in.kanth.DesginPatterns.MySingelton1");
	//	MySingelton1 m1=(MySingelton1) d.newInstance();
		Method m11=d.getMethod("getInstance", new Class[0]);
		m11.setAccessible(true);
		m11.invoke(d,  new Class[0]); */
		
		//creating two instances for a singleton (lazy intialized ) using reflection API
		
		MySingelton2  si2=MySingelton2.getMyobj();
		System.out.println(si2);
		
		Class<MySingelton2> clazz=MySingelton2.class;
		Constructor<MySingelton2> cons = clazz.getDeclaredConstructor();
		cons.setAccessible(true);
		MySingelton2 s2 = cons.newInstance();   
		System.out.println(s2);
		
		//creating two instances for a singleton (eager intialized ) using reflection API
		
		MySingelton1 m11=MySingelton1.getMyobj();
		Class<MySingelton1> clazz1=MySingelton1.class;
		Constructor<MySingelton1> cons1 = clazz1.getDeclaredConstructor();
		cons1.setAccessible(true);
		MySingelton1 s21 = cons1.newInstance();  
		System.out.println(m11);
		System.out.println(s21);
		
		
		;
		
	}

}
