package leetcode;

public class RemoveDuplicateLetters {
	public String removeDuplicateLetters(String s) {
		int[] flags = new int[26];
		int[] index = new int[26];
		int length = s.length();
		StringBuilder sb = new StringBuilder(s);
		StringBuilder re = new StringBuilder("");
		String a, b;
		StringBuilder temp=new StringBuilder();
		int j = 0;
		for (int i = 0; i < length; i++) {
			if (flags[sb.charAt(i) - 'a'] == 0) {
				flags[sb.charAt(i) - 'a'] = 1;
				index[sb.charAt(i) - 'a'] = j;
				j++;
				re.append(sb.charAt(i));
				//System.out.println(re.toString());
			} else {
				a = re.toString();
				temp = re.deleteCharAt(index[sb.charAt(i) - 'a']);
				temp = temp.append(sb.charAt(i));
				b = temp.toString();
				if (b.compareTo(a) < 0) {
					//System.out.println("b is "+b+"  a is "+a);
					re = temp;
					j--;
					int t=index[sb.charAt(i) - 'a'];
					index[sb.charAt(i) - 'a'] = j;
					for(int k=t+1;k<j;k++){
						index[re.charAt(k) - 'a'] --;
					}
				}
				//System.out.println(re.toString());
			}
		}
		return re.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RemoveDuplicateLetters().removeDuplicateLetters("cbacdcbc");
	}

}
