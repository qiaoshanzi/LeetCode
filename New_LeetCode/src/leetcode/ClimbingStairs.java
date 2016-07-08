package leetcode;

public class ClimbingStairs {
	public int climbStairs(int n) {
		int[] a=new int[n+1];
        if(n<3)
            return n;
        else{
        	a[1]=1;
        	a[2]=2;
        	for(int i=3;i<=n;i++){
        		a[i]=a[i-1]+a[i-2];
        	}
        	return a[n];
        }  
    }
	public int climbStairs1(int n){
		if(n<3)
			return n;
		else{
			int beforeOne=2,beforeTwo=1,sum = 0;
			for(int i=3;i<=n;i++){
				sum=beforeOne+beforeTwo;
				beforeTwo=beforeOne;
				beforeOne=sum;
			}
			return sum;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ClimbingStairs().climbStairs1(4));
	}

}
