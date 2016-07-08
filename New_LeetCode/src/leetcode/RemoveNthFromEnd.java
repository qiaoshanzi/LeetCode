package leetcode;

import java.util.HashMap;

public class RemoveNthFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ListNode p = head, q;
		int index = 1;
		while (p.next != null) {
			map.put(index, p.val);
			index++;
			p = p.next;
		}
		map.put(index, p.val);
		int key = index + 1 - n;
		int val = map.get(index + 1 - n);
		p = q = head;
		for (int i = 1; i < key; i++) {
			q = p;
			p = p.next;
		}
		if (p == q)
			head = p.next;
		else {
			q.next = p.next;
		}
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(4);
		ListNode b = new ListNode(5);
		ListNode c = new ListNode(4);
		// ListNode d=new ListNode(4);
		// ListNode e=new ListNode(5);
		a.next = b;
		b.next = c;
		// c.next=d;
		// d.next=e;
		ListNode head = a;
		new RemoveNthFromEnd().removeNthFromEnd(head, 1);
	}

}
