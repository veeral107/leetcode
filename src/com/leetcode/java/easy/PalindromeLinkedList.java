package com.leetcode.java.easy;
//234. Palindrome Linked List Add to List

//Given a singly linked list, determine if it is a palindrome.
//Could you do it in O(n) time and O(1) space?

public class PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {

		if (head == null || head.next == null) {
			return true;
		}

		ListNode reverseHead = reverseLinkedList(head);
		print(head);
		print(reverseHead);

		while (head != null) {
			if (head.val == reverseHead.val) {
				head = head.next;
				reverseHead = reverseHead.next;
			} else {
				return false;
			}
		}
		return true;
	}

	private void print(ListNode listnode) {
		System.out.println("---------");
		while (listnode != null) {
			System.out.println(listnode.val);
			listnode = listnode.next;
		}
		System.out.println("---------");
	}

	public ListNode reverseLinkedList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		// 9>3
		if (head.next.next == null) {
			ListNode temp = head.next;
			head.next.next = head;
			head.next = null;
			return temp;
		}
		// 9>3>5>1
		ListNode first = head; // 9
		ListNode second = head.next; // 3
		ListNode third = head.next.next;// 5
		while (third != null && third.next != null) {
			second.next = first; // 3 points to 9
			first = second; // first=3
			second = third;// second=5
			third = third.next;// third=1
		}
		second.next = first;
		third.next = second;
		head.next = null;
		return third;
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
		PalindromeLinkedList callingObject = new PalindromeLinkedList();
		ListNode n1 = callingObject.new ListNode(9);
		ListNode n2 = callingObject.new ListNode(1);
		ListNode n3 = callingObject.new ListNode(2);
		ListNode n4 = callingObject.new ListNode(9);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;

		boolean output = callingObject.isPalindrome(n1);
		System.out.println("expected=false    Actual=" + output);

	}
}
