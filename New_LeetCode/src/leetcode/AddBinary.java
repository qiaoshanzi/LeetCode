package leetcode;

import java.util.HashMap;

public class AddBinary {

	public String addBinary(String a, String b) {
		int i = 0, length1 = a.length(), length2 = b.length();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("000", "00");
		map.put("001", "01");
		map.put("010", "01");
		map.put("011", "10");
		map.put("100", "01");
		map.put("101", "10");
		map.put("110", "10");
		map.put("111", "11");
		String s = "0", result = "", value;
		while (i < length1 && i < length2) {
			s += a.charAt(length1 - 1 - i);
			s += b.charAt(length2 - 1 - i);
			value = map.get(s);
			result += value.charAt(1);
			s = value.substring(0, 1);
			i++;
		}
		if (i >= length1) {
			while (i < length2) {
				s += b.charAt(length2 - 1 - i);
				s += "0";
				value = map.get(s);
				result += value.charAt(1);
				s = value.substring(0, 1);
				i++;
			}
		} else {
			while (i < length1) {
				s += a.charAt(length1 - 1 - i);
				s += "0";
				value = map.get(s);
				result += value.charAt(1);
				s = value.substring(0, 1);
				i++;
			}
		}
		if (s.equals("1"))
			result += s;
		return new StringBuilder(result).reverse().toString();
	}

	public String addBinary1(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int i = a.length() - 1, j = b.length() - 1, carry = 0;
		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (j >= 0)
				sum += b.charAt(j--) - '0';
			if (i >= 0)
				sum += a.charAt(i--) - '0';
			sb.append(sum % 2);
			carry = sum / 2;
		}
		if (carry != 0)
			sb.append(carry);
		return sb.reverse().toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new AddBinary().addBinary("1", "111"));
		System.out.println('1' - '0');
	}

}
