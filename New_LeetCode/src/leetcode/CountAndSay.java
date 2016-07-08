package leetcode;
/**
 * 
 * @author audr00
 * s和t是StringBuilder比是String类型速度快。
 */
public class CountAndSay {

	public String countAndSay(int n){
		StringBuilder s=new StringBuilder("1");
		StringBuilder t=new StringBuilder("1");
		int num;
		int j;
		for(int i=1;i<n;i++){
			s=t;
			t=new StringBuilder();
			num=1;
			for(j=1;j<s.length();j++){
				if(s.charAt(j)==s.charAt(j-1))
					num++;
				else{
					t=t.append(num);
					t=t.append(s.charAt(j-1));
					num=1;
				}
			}
			t=t.append(num);
			t=t.append(s.charAt(j-1));
		}
		return t.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new CountAndSay().countAndSay(6));
	}

}
