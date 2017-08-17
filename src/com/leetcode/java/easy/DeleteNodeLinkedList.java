package com.leetcode.java.easy;
// 237. Delete Node in a Linked List

// Write a function to delete a node (except the tail) in a singly linked list, 
// given only access to that node.
//30 April 2017

public class DeleteNodeLinkedList {
	public void deleteNode(ListNode node) {

		node.val = node.next.val;
		node.next = node.next.next;

	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

}
