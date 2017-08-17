package com.leetcode.java.easy;

import java.util.HashMap;
import java.util.Map;

//160. Intersection of Two Linked Lists
//Write a program to find the node at which the intersection of two singly linked lists begins.

public class IntersectionLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		Map<Integer, Integer> mapLinkedList1 = new HashMap<Integer, Integer>();

		while (headA != null) {
			if (!mapLinkedList1.containsKey(headA.val)) {
				mapLinkedList1.put(headA.val, 1);
			} else {
				int temp = mapLinkedList1.get(headA.val);
				mapLinkedList1.put(headA.val, temp + 1);
			}
			headA = headA.next;
		}

		while (headB != null) {
			if (mapLinkedList1.containsKey(headB.val)) {
				return headB;
			} else
				headB = headB.next;
		}
		return null;
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
		IntersectionLinkedLists callingObject = new IntersectionLinkedLists();
		ListNode n1 = callingObject.new ListNode(9);
		ListNode n2 = callingObject.new ListNode(3);
		ListNode n3 = callingObject.new ListNode(2);
		ListNode n4 = callingObject.new ListNode(1);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;

		ListNode m1 = callingObject.new ListNode(7);
		ListNode m2 = callingObject.new ListNode(2);
		ListNode m3 = callingObject.new ListNode(3);
		m1.next = m2;
		m2.next = m3;

		ListNode output = callingObject.getIntersectionNode(n1, m1);
		System.out.println("expected node: 2 " + "actual node: " + output.val);

	}
}
