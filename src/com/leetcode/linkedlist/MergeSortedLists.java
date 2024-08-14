package com.leetcode.linkedlist;

public class MergeSortedLists {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode output = null;
		while (list1 != null || list2 != null) {
			ListNode newNode = null;
			if (list1 == null) {
				newNode = new ListNode(list2.val);
				list2 = list2.next;
			} else if (list2 == null) {
				newNode = new ListNode(list1.val);
				list1 = list1.next;
			} else if (list1.val < list2.val) {
				newNode = new ListNode(list1.val);
				list1 = list1.next;
			} else {
				newNode = new ListNode(list2.val);
				list2 = list2.next;
			}
			if (newNode != null) {
				if (output == null) {
					output = newNode;
				} else {
					ListNode temp = output;
					while (temp.next != null) {
						temp = temp.next;
					}
					temp.next = newNode;
				}
			}
		}
		return output;
	}
}