package leetcode;

import java.util.Scanner;

/*
 * 
 * 0A     8I     16Q     24Y
 * 1B  7H 9J  15P17R  23X25Z
 * 2C 6G 10K 14O 18S 22W 
 * 3D5F  11L13N  19T21V
 * 4E    12M     20U
 */
public class ZigZagConversion {
	public String convert(String s,int numRows){
		if(s.length()<=numRows||numRows==1)
			return s;
		StringBuilder []res=new StringBuilder[numRows];
		for(int i=0;i<numRows;i++)
			res[i]=new StringBuilder();
		int loop=2*numRows-2;
		int mid=numRows-1;
		for(int i=0;i<s.length();i++){
			res[mid-Math.abs(i%loop-mid)].append(s.charAt(i));
		}
		for(int i=1;i<numRows;i++)
			res[0].append(res[i]);
		return res[0].toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=null;
		int n=0;
		str=s.next();
		n=s.nextInt();
		System.out.println(new ZigZagConversion().convert(str, n));
	}

}
