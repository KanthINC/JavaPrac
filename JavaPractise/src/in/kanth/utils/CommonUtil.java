package in.kanth.utils;

import java.util.List;
import static java.util.stream.Collectors.joining;
/**
 * 
 * @author ramakanth.b
 *
 */
public class CommonUtil {

	/**
	 * 
	 * @param paraList
	 * @return
	 */
	public static <T> String getWithINParam(List<T> paraList) {
		if (null != paraList)
			return paraList.stream().map(s -> new StringBuilder("'").append(s).append("'")).collect(joining(","));
		else
			throw new NullPointerException();

	}
}
