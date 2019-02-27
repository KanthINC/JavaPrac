package in.kanth.utils;

import java.math.BigDecimal;

public class NumbersUtil {

	/**
	 * Converting Exponential number to Number 
	 * ex:9.87654321345606E12   to 9876543213456.06 
	 * @param exponential
	 * @return
	 */
	public static String convertExpoToNumber(double exponential) {
		return BigDecimal.valueOf(exponential).toPlainString();
	}
}
