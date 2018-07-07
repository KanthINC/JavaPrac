package in.kanth.reflection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import in.kanth.beans.EmployeeBean;
import in.kanth.beans.PersonBean;

public class DynamicMethodInvocation {

	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		List<PersonBean> p = getPersonBean();
		List<EmployeeBean> e = getEmplist();
		Map<String, String> val = getValues();
		System.out.println(getModifiedList( p, val, "name", "lang"));
		System.out.println();
		System.out.println(getModifiedList( e, val, "empid", "complang"));
	}

	public static List<PersonBean> getPersonBean() {

		PersonBean bean1 = new PersonBean();
		bean1.setName("sanjay");
		bean1.setDob("May8th");
		bean1.setCountry("India");
		bean1.setLang("telugu");

		PersonBean bean2 = new PersonBean();
		bean2.setName("manoj");
		bean2.setDob("May20th");
		bean2.setCountry("India");
		bean2.setLang("hindi");

		PersonBean bean3 = new PersonBean();
		bean3.setName("hema");
		bean3.setDob("Spt4th");
		bean3.setCountry("India");
		bean3.setLang("oriya");

		List<PersonBean> pesronlist = new ArrayList<PersonBean>();
		pesronlist.add(bean1);
		pesronlist.add(bean2);
		pesronlist.add(bean3);
		return pesronlist;
	}

	public static List<EmployeeBean> getEmplist() {
		EmployeeBean bean1 = new EmployeeBean();
		bean1.setComid("iadmin");
		bean1.setComplang("java");
		bean1.setDob("1stmay");
		bean1.setEmpid("916");

		EmployeeBean bean2 = new EmployeeBean();
		bean2.setComid("iadmin");
		bean2.setComplang("cpp");
		bean2.setDob("1stmay");
		bean2.setEmpid("998");

		EmployeeBean bean3 = new EmployeeBean();
		bean3.setComid("iadmin");
		bean3.setComplang("python");
		bean3.setDob("1stmay");
		bean3.setEmpid("879");

		List<EmployeeBean> emplist = new ArrayList<EmployeeBean>();
		emplist.add(bean1);
		emplist.add(bean2);
		emplist.add(bean3);
		return emplist;
	}

	public static Map<String, String> getValues() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("telugu", "TEL");
		map.put("hindi", "HIN");
		map.put("oriya", "ORY");
		map.put("java", "J2EE");
		map.put("python", "PY");
		map.put("cpp", "CPP");
		return map;
	}

	public static List<?> getModifiedList(List<?> sourcelist, Map<String, String> rb, String targetfieldName,
			String sourceFiledName) {

		sourcelist.forEach(obj -> {
			Field tarfield = null;
			Field srcfield = null;
			try {
				Class<?> cls = obj.getClass();
				tarfield = cls.getDeclaredField(targetfieldName);
				srcfield = cls.getDeclaredField(sourceFiledName);
				tarfield.setAccessible(true);
				srcfield.setAccessible(true);
				tarfield.set(obj, rb.get(srcfield.get(obj)));
			} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
				System.out.println("No such fields " + e);
			}

		});
		return sourcelist;
	}
	
	
}
