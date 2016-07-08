package leetcode;

public class ImplementStrStr {
	public int strStr(String haystack, String needle) {
		if (haystack == null || needle == null
				|| haystack.length() < needle.length())
			return -1;
		int length1 = needle.length();
		int length2 = haystack.length();
		String sub;
		for (int i = 0; i < length2 - length1 + 1; i++) {
			sub = haystack.substring(i, i + length1);
			if (sub.equals(needle))
				return i;
		}
		return -1;
	}
	
	public int strStr1(String haystack,String needle){
		int n=haystack.length();
		int m=needle.length();
		int i=0,j=0;
		while(i<n&&j<m){
			if(haystack.charAt(i)==needle.charAt(j)){
				i++;
				j++;
			}else{
				i=i-j+1;
				j=0;
			}
		}
		if(j==m){
			return i-j;
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
