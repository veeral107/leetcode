package com.leetcode.java.medium;

//328. Odd Even Linked List
//The program should run in O(1) space complexity and O(nodes) time complexity.
//Given 1->2->3->4->NULL,
//return 1->3->2->4->NULL.
public class OddEvenLinkedList {
	public ListNode oddEvenList(ListNode head) {

		if (head == null) {
			return null;
		}

		ListNode odd = head; // odd=1
		ListNode even = head.next; // even=2
		ListNode temp = head.next; // even=2
		// 1 > 2 > 3 > 4 > null
		while (even != null && even.next != null) {
			odd.next = odd.next.next; // 1>3>4>null
			even.next = even.next.next; // 2>4>null
			odd = odd.next; // odd=3
			even = even.next; // even=4
		}
		// ListNode output = head; // 1
		// while (output.next != null) {
		// output = output.next; //
		// }
		// output.next = temp;
		odd.next = temp;
		return head;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	// main
	public static void main(String[] args) {
		OddEvenLinkedList callingObject = new OddEvenLinkedList();
		ListNode n1 = callingObject.new ListNode(1);
		ListNode n2 = callingObject.new ListNode(2);
		ListNode n3 = callingObject.new ListNode(3);
		ListNode n4 = callingObject.new ListNode(4);
		// ListNode n5 = callingObject.new ListNode(5);
		// ListNode n6 = callingObject.new ListNode(6);
		// ListNode n7 = callingObject.new ListNode(7);
		// ListNode n8 = callingObject.new ListNode(8);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		// n4.next = n5;
		n4.next = null;
		// n5.next = n6;
		// n6.next = n7;
		// n7.next = n8;
		// n8.next = null;

		ListNode l3 = callingObject.oddEvenList(n1);

		while (l3 != null) {
			System.out.println(l3.val);
			l3 = l3.next;
		}

	}
}
