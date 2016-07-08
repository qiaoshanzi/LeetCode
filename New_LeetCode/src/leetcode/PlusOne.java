package leetcode;

public class PlusOne {
	public int[]plusOne(int []digits){
		int carry=0,sum=0;
		sum=digits[digits.length-1]+1+carry;
		carry=sum/10;
		digits[digits.length-1]=sum%10;
		for(int i=digits.length-2;i>=0&&carry>0;i--){
			sum=digits[i]+carry;
			carry=sum/10;
			digits[i]=sum%10;
		}
		if(carry==0)
			return digits;
		else{
			int res[]=new int[digits.length+1];
			res[0]=carry;
			for(int i=0;i<digits.length;i++){
				res[i+1]=digits[i];
			}
			return res;
		}
		
	}
	public int[] plusOne1(int[] digits) {

	    int n = digits.length;
	    for(int i=n-1; i>=0; i--) {
	        if(digits[i] < 9) {
	            digits[i]++;
	            return digits;
	        }

	        digits[i] = 0;
	    }

	    int[] newNumber = new int [n+1];
	    newNumber[0] = 1;

	    return newNumber;
	}
	
	public int[] plusOne2(int[] digits) {
		int i = digits.length;
		boolean one = true;
		while (--i >= 0 && one) {
			digits[i]++;
			one = digits[i] == 10;
			if (one)
				digits[i] = 0;
		}
		if (one) {
			digits = new int[digits.length + 1];
			digits[0] = 1;
		}
		return digits;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []digits={9,9,9};
	new PlusOne().plusOne(digits);
	}

}
