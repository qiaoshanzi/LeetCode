package leetcode;

public class LongestCommonPrefix {

	public String longestCommonPrefix(String [] strs){
		if(strs.length==0)
			return null;
		String s=null;
		int prefixLength=0;
		boolean b=false;
		int minLength=strs[0].length();
		for(int i=1;i<strs.length;i++){
			if(strs[i].length()<minLength){
				minLength=strs[i].length();
			}
		}
		for(;prefixLength<minLength;prefixLength++){
			for(int j=0;j<strs.length;j++){
				if(strs[j].charAt(prefixLength)!=strs[0].charAt(prefixLength)){	
					b=true;
					break;
				}
			}
			if(b)
				break;
		}
		if(prefixLength==0)
			return null;
		s=strs[0].substring(0, prefixLength);
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = { "asd1234we", "asd1234yuer", "asd12345", "asd123456fghj34535"};
		System.out.println(new LongestCommonPrefix().longestCommonPrefix(s));
		String a="aersdfgh",b="aer";
		System.out.println(a.indexOf(b));
		System.out.println(a.substring(0, 0).equals(""));
	}
	
}
