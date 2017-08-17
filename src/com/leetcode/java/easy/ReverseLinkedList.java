package com.leetcode.java.easy;

//2 may 2017
//206. Reverse Linked List
//Reverse a singly linked list
public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {

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

	public static void main(String[] args) {
		ReverseLinkedList callingObject = new ReverseLinkedList();
		ListNode n1 = callingObject.new ListNode(9);
		ListNode n2 = callingObject.new ListNode(3);
		ListNode n3 = callingObject.new ListNode(5);
		ListNode n4 = callingObject.new ListNode(1);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;

		ListNode l3 = callingObject.reverseList(n1);

		// System.out.println("");
		// System.out.println("start printing reverse linked list");
		while (l3 != null) {
			System.out.println(l3.val);
			l3 = l3.next;
		}

	}
}

// with comments
//
// if (head == null || head.next == null) {
// return head;
// }
//// 9>3
// if(head.next.next==null){
// ListNode temp = head.next;
// head.next.next = head;
// head.next = null;
//
// return temp;
// }
//
//// 9>3>5>1
// ListNode endNode=head;
//// System.out.println("endNode " + endNode.val);
//
// ListNode first = head; // 9
//// System.out.println("first " + first.val);
//
// ListNode second = head.next; // 3
//// System.out.println("second " + second.val);
//
// ListNode third = head.next.next;// 5
//// System.out.println("third " + third.val);
//// System.out.println(" ");
//
// endNode.next=null;
//// System.out.println("endNode " + endNode.next);
//
//
// while (third.next!= null) {
//// System.out.println("");
//// System.out.println("in while loop ");
//
// second.next = first; // 3 points to 9
//// System.out.println("second.next " + second.next.val);
//
// first = second; // first=3
//// System.out.println("first " + first.val);
//
// second = third;// second=5
//// System.out.println("second " + second.val);
//
// third = third.next;// third=1
//// System.out.println("third " + third.val);
//// System.out.println("while loop iterates");
//// System.out.println("");
// }
//// System.out.println("while loop ends");
//
// if(third.next==null){
// second.next=first;
// third.next=second;
//// System.out.println("first element of rll "+ third.val);
// }
//
//
//
// return third;
//
//
