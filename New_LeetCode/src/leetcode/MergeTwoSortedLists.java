package leetcode;
public class MergeTwoSortedLists {

	public ListNode mergeTwoLists(ListNode l1,ListNode l2){
		if(l1==null)
			return l2;
		if(l2==null)
			return l1;
		ListNode l3,p;
		if(l1.val<=l2.val){
			l3=l1;
			p=l1;
			l1=l1.next;
		}else{
			l3=l2;
			p=l2;
			l2=l2.next;
		}
		while(l1!=null&&l2!=null){
			if(l1.val<=l2.val){
				p.next=l1;
				l1=l1.next;
				p=p.next;
			}else{
				p.next=l2;
				l2=l2.next;
				p=p.next;
			}
		}
		if(l1==null){
			p.next=l2;
		}else{
			p.next=l1;
		}
		return l3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(3);
		ListNode c = new ListNode(5);
		a.next = b;
		b.next = c;
		ListNode l1 = a;
		
		ListNode d = new ListNode(2);
		ListNode e = new ListNode(2);
		ListNode f = new ListNode(4);
		ListNode g = new ListNode(6);
		d.next = e;
		e.next = f;
		f.next = g;
		ListNode l2 = d;
		ListNode l3=new MergeTwoSortedLists().mergeTwoLists(l1, l2);
		while(l3!=null){
			System.out.println(l3.val);
			l3=l3.next;
		}
	}

}
