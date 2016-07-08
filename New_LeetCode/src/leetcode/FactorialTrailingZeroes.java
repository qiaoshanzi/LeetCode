package leetcode;

public class FactorialTrailingZeroes {
	public int trailingZeroes(int n) {
		int i,t=5,sum=0;
		for(i=0;t<n;i++){
			t=t*5;
			sum+=i;
		}
        return n/5+sum;
    }
	public int trailingZeroes1(int n) {
		
        return  n==0?0:n/5+trailingZeroes1(n/5);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialTrailingZeroes f=new FactorialTrailingZeroes();
		int m=f.trailingZeroes(130);
		int n=f.trailingZeroes1(130);
		System.out.println(m+" "+n);
	}

}
