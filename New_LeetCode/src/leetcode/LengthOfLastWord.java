package leetcode;

public class LengthOfLastWord {

	public int lengthOfLastWord(String s){
		String[] charArray=s.split(" ");
		if(charArray.length<1)
			return 0;
		return charArray[charArray.length-1].length();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LengthOfLastWord().lengthOfLastWord(" "));
	}

}
