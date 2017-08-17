package com.leetcode.java.easy;

//Given a linked list, determine if it is a cyclical linked list. Can you solve it without using extra space?
public class CyclicalLinkedList {
	public boolean hasCycle(ListNode head) {
		if (head == null) {
			return false;
		}

		ListNode temp = head;

		while (temp.next != null) {
			temp = temp.next;
			if (temp.val == head.val && temp.next == head.next) {
				return true;
			}
			// if (temp.equals(head)) {
			// return true;
			// }
		}

		return false;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		CyclicalLinkedList callingObject = new CyclicalLinkedList();
		ListNode n1 = callingObject.new ListNode(7);
		ListNode n2 = callingObject.new ListNode(2);
		ListNode n3 = callingObject.new ListNode(3);
		n1.next = n2;
		n2.next = n3;
		n3.next = n1;

		ListNode n4 = callingObject.new ListNode(9);

		boolean output = callingObject.hasCycle(n1);
		System.out.println("expected: true " + "actual: " + output);

		boolean output2 = callingObject.hasCycle(n4);
		System.out.println("expected: false " + "actual: " + output2);
	}

}

// if (head == null ) {
// return false;
// }
// if(head!=null && head.next==null){
// return true;
// }
//
// ListNode start = head;
// int end = 0;
// while (head != null) {
// end = head.val;
// head = head.next;
// }
// if (start.val != end) {
// return false;
// }
// return true;
//
