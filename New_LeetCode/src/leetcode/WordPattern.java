package leetcode;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class WordPattern {
	public boolean wordPattern(String pattern, String str) {
		StringBuilder stringBuilder = new StringBuilder(pattern);
		String[] stringArray = str.split(" ");
		if (stringBuilder.length() != stringArray.length)
			return false;

		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sdiuf");
		

	}

}
