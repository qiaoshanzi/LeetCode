package leetcode;

public class RomanToInteger {

	public int romanToInt(String s) {
		int ret = 0;
		char c, c1;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (i == s.length() - 1) {
				c = s.charAt(i);
				if (c == 'I') {
					ret += 1;
				} else if (c == 'V') {
					ret += 5;
				} else if (c == 'X') {
					ret += 10;
				} else if (c == 'L') {
					ret += 50;
				} else if (c == 'C') {
					ret += 100;
				} else if (c == 'D') {
					ret += 500;
				} else if (c == 'M') {
					ret += 1000;
				}
				continue;
			}

			c = s.charAt(i);
			c1 = s.charAt(i + 1);
			if (c == 'I') {
				if (c1 == 'V' || c1 == 'X') {
					ret -= 1;
				} else {
					ret += 1;
				}
			} else if (c == 'V') {
				ret += 5;
			} else if (c == 'X') {
				if (c1 == 'L' || c1 == 'C') {
					ret -= 10;
				} else {
					ret += 10;
				}
			} else if (c == 'L') {

				ret += 50;

			} else if (c == 'C') {
				if (c1 == 'D' || c1 == 'M') {
					ret -= 100;
				} else {
					ret += 100;
				}
			} else if (c == 'D') {

				ret += 500;

			} else if (c == 'M') {
				ret += 1000;
			}
		}

		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new RomanToInteger().romanToInt("XCIX"));
	}

}
