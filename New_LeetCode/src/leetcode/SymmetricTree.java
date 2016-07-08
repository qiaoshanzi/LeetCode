package leetcode;

import java.util.Stack;

public class SymmetricTree {

	public boolean isSymmetric(TreeNode root){
		if(root!=null){
			return isSameTree1(root.left,root.right);
		}
		return false;
		
	}
	public boolean isSameTree1(TreeNode p,TreeNode q){
		if(p==null&&q==null)
			return true;
		if(p==null||q==null)
			return false;
		if(p.val==q.val)
			return isSameTree1(p.left,q.left)&&isSameTree1(p.right,q.right);
		return false;
	}
	public boolean isSymmetric1(TreeNode root){
		if(root==null||root.left==null&&root.right==null)
			return true;
		Stack<TreeNode> left=new Stack<TreeNode>();
		Stack<TreeNode> right=new Stack<TreeNode>();
		left.push(root.left);
		right.push(root.right);
		TreeNode leftPop,rightPop;
		while(!left.isEmpty()&&!right.isEmpty()){
			leftPop=left.pop();
			rightPop=right.pop();
			if(leftPop.val!=rightPop.val) return false;
			if(leftPop.left!=null) left.push(leftPop.left);
			if(rightPop.right!=null) right.push(rightPop.right);
			if(leftPop.right!=null) left.push(leftPop.right);
			if(rightPop.left!=null) right.push(rightPop.left);
		}
		return left.size()==right.size();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
