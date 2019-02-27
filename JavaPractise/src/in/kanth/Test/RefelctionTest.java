package in.kanth.Test;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import in.kanth.beans.DataBeans;

public class RefelctionTest {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();
		map.put("1", "hello1@");
		map.put("2", "hello2@");
		map.put("3", "hello3@");
		List<DataBeans> mylist = Arrays.asList(new DataBeans(1l, "anil", 123, "hello1", 40000.0),
				new DataBeans(2l, "kanth", 123, "hello2", 45000.0),
				new DataBeans(3l, "sanjay", 123, "hello3", 49000.0));
		mylist = getModifiedList(mylist, map, "id", "peid");
		mylist.forEach(k -> System.out.println(k.getPeid()));

	}

	public static <T> List<T> getModifiedList(List<T> sourcelist, Map<String, String> resource, String sourceFiledName,
			String targetfieldName) {
		Class<?> type=String.class;
		if (null != sourcelist) {
			sourcelist.forEach(obj -> {
				Field tarfield = null;
				Field srcfield = null;
				try {
					Class<?> cls = obj.getClass();
					tarfield = cls.getDeclaredField(targetfieldName);
					srcfield = cls.getDeclaredField(sourceFiledName);
					tarfield.setAccessible(true);
					srcfield.setAccessible(true);
					Object obj2=null;
					if(String.class.isInstance(srcfield.get(obj))){
						 obj2 = resource.get(srcfield.get(obj));
					}else{
						  obj2 =resource.get(String.valueOf(srcfield.get(obj)));
					}
					
					if (null != obj2) {
						tarfield.set(obj, obj2);
					}
				} catch (NoSuchFieldException | SecurityException | IllegalArgumentException
						| IllegalAccessException e) {
					System.out.println(e);
				} catch (Exception e) {
					System.out.println(e);
				}

			});
		}
		return sourcelist;
	}
}
