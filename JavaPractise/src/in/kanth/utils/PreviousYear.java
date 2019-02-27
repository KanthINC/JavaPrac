package in.kanth.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.regex.Pattern;

public class PreviousYear {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String input = "Chrome";
		String input1="firefox";
        String agent="Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36";
        String agent1="Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:64.0) Gecko/20100101 Firefox/64.0";

		System.out.println(Pattern.compile(Pattern.quote(input1), Pattern.CASE_INSENSITIVE).matcher(agent1).find());
		
		
	}

}
