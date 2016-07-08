package leetcode;

import java.util.HashMap;


public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		for(int i=0;i<9;i++){
			if(!isParticallyValid(board,i,0,i,8))
				return false;
			if(!isParticallyValid(board,0,i,8,i))
				return false;
		}
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++){
				if(!isParticallyValid(board,3*i,3*j,3*i+2,3*j+2))
					return false;
			}
			
		return true;

	}
	public boolean isParticallyValid(char[][]board,int x1,int y1,int x2,int y2){
		HashMap map=new HashMap();
		for(int i=x1;i<=x2;i++)
			for(int j=y1;j<=y2;j++){
				if(board[i][j]!='.'){
					if(map.containsKey(board[i][j]))
						return false;
					map.put(board[i][j], 0);
				}
			}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [][] board={{'5','3'},{},{},{},{},{},{},{},{}};
		//new ValidSudoku().isValidSudoku(null);
		System.out.println(board.length);
	}

}
