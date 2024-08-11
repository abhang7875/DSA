package com.leetcode.linkedlist;

public class AddTwoNumbers {
	class ListNode {
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

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode output = null;
		int carry = 0;
		while (l1 != null || l2 != null) {
			int a = 0, b = 0;
			if (l1 != null) {
				a = l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				b = l2.val;
				l2 = l2.next;
			}
			int sum = a + b + carry;
			if (sum >= 10) {
				sum %= 10;
				carry = 1;
			} else {
				carry = 0;
			}
			if (output == null) {
				output = new ListNode(sum);
			} else {
				ListNode temp = output;
				while (temp.next != null)
					temp = temp.next;
				temp.next = new ListNode(sum);
			}
		}
		if (carry != 0) {
			if (output == null) {
				output = new ListNode(carry);
			} else {
				ListNode temp = output;
				while (temp.next != null)
					temp = temp.next;
				temp.next = new ListNode(carry);
			}
		}
		return output;
	}
}