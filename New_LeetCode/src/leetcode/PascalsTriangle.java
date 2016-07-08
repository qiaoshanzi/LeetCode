package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows){
		List<List<Integer>> allrows=new ArrayList<List<Integer>>();
		ArrayList<Integer> row=new ArrayList<Integer>();
		for(int i=0;i<numRows;i++){
			row.add(0,1);
			for(int j=1;j<row.size()-1;j++){
				row.set(j, row.get(j)+row.get(j+1));
			}
			allrows.add(new ArrayList<Integer>(row));
		}
		return allrows;
	}
	public List<Integer> getRow(int rowIndex){
        Integer [] a=new Integer[rowIndex+1];
        Arrays.fill(a, 0);
        for(int i=0;i<=rowIndex;i++){
            a[0]=1;
            for(int j=i;j>0;j--){
                a[j]=a[j]+a[j-1];
            }
        }
        return Arrays.asList(a);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PascalsTriangle().getRow(1);
	}

}
