package leetcode;

import java.util.Stack;

public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p != null && q != null) {
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
					&& (p.val == q.val);
		} else if (p != null || q != null) {
			return false;
		} else {
			return true;
		}

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
	public boolean isSameTree2(TreeNode p,TreeNode q){
		Stack<TreeNode> stack_p=new Stack<TreeNode>();
		Stack<TreeNode> stack_q=new Stack<TreeNode>();
		if(p!=null) stack_p.push(p);
		if(q!=null) stack_q.push(q);
		while(!stack_p.isEmpty()&&!stack_q.isEmpty()){
			TreeNode pn=stack_p.pop();
			TreeNode qn=stack_p.pop();
			if(pn.val!=qn.val) return false;
			if(pn.right!=null) stack_p.push(pn.right);
			if(qn.right!=null) stack_q.push(qn.right);
			if(stack_p.size()!=stack_q.size()) return false;
			if(pn.left!=null) stack_p.push(pn.left);
			if(qn.left!=null) stack_q.push(qn.left);
			if(stack_p.size()!=stack_q.size()) return false;
				
		}
		return stack_p.size()==stack_q.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
