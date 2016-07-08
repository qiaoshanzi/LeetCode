package leetcode1;

public class PalindromeNumber {

	public boolean isPalindrome(int x){
		int rev=0;
		int x1=x;
		while(x>0){
			rev=rev*10+x%10;
			x/=10;
		}
		return x1==rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
