package leetcode;

import java.util.Hashtable;

public class HappyNumber {
	public boolean isHappy(int n) {
        Hashtable<Integer,Integer> ht=new Hashtable<Integer,Integer>();
        int a=n,b,c;
        while(!ht.containsKey(1)&&!ht.containsKey(n)){
            c=0;
            while(a>0){
                b=a%10;
                c+=b*b;
                a=a/10;
            }
            ht.put(n,c);
            a=n=c;
        }
        if(ht.containsKey(1))
        	return true;
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HappyNumber h=new HappyNumber();
		System.out.println(h.isHappy(9));
	}

}
