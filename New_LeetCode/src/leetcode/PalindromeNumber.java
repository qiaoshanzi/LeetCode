package leetcode;

public class PalindromeNumber {
	public boolean isPalindrome(int x){
		if(x<0)
			return false;
		String s=Integer.toString(x);
		int l=s.length();
		for(int i=0;i<=(l/2);i++){
			if(s.charAt(i)!=s.charAt(l-i-1)){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new PalindromeNumber().isPalindrome(-123321));
	}

}
