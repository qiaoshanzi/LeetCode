package leetcode;

public class RemoveDuplicatesfromSortedList {
	public ListNode deleteDuplicates(ListNode head){
		if(head==null)
			return null;
		ListNode p=head.next,q=head;
		int a=head.val,b;
		while(p!=null){
			b=p.val;
			if(a==b){
				q.next=p.next;
				p=p.next;
			}else{
				q=p;
				p=p.next;
				a=b;
			}
		}
		return head;
		
	}
	public ListNode deleteDuplicates1(ListNode head){
		ListNode p=head;
		while(p!=null){
			if(p.next==null)
				break;
			if(p.val==p.next.val){
				p.next=p.next.next;
			}else{
				p=p.next;
			}
		}
		
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a=new ListNode(1);
		ListNode b=new ListNode(2);
		ListNode c=new ListNode(2);
		ListNode d=new ListNode(3);
		ListNode e=new ListNode(3);
		ListNode f=new ListNode(3);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=f;
		
	}

}
