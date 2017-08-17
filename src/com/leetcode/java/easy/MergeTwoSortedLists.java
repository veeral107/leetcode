package com.leetcode.java.easy;
//21. Merge Two Sorted Lists

//Merge two sorted linked lists and return it as a new list. 
//The new list should be made by splicing together the nodes of the first two lists.

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode l3Now = new ListNode(0);
		ListNode l3 = l3Now;

		while (l1 != null && l2 != null) {
			if (l1.val > l2.val) {
				l3Now.next = l2;
				l2 = l2.next;
			} else {
				l3Now.next = l1;
				l1 = l1.next;
			}
			l3Now = l3Now.next;
		}

		if (l1 == null) {
			l3Now.next = l2;
		}

		if (l2 == null) {
			l3Now.next = l1;
		}

		return l3.next;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		MergeTwoSortedLists callingObject = new MergeTwoSortedLists();

		ListNode n1 = callingObject.new ListNode(1);
		ListNode n2 = callingObject.new ListNode(3);
		ListNode n3 = callingObject.new ListNode(5);
		n1.next = n2;
		n2.next = n3;

		ListNode m1 = callingObject.new ListNode(2);
		ListNode m2 = callingObject.new ListNode(4);
		ListNode m3 = callingObject.new ListNode(6);
		m1.next = m2;
		m2.next = m3;

		ListNode o1 = callingObject.mergeTwoLists(n1, m1);

		System.out.println("printStart");
		while (o1 != null) {
			System.out.println(o1.val);
			o1 = o1.next;
		}
		System.out.println("printEnd");
	}
}
