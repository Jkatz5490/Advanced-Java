package interviewCodingQuestions;

import leetCode.ListNode;

public class Q3_Merge_two_sorted_linkedlists {

	public static void main(String[] args) {
		ListNode head1 = new ListNode(1);
		head1.next = new ListNode(3);
		head1.next.next = new ListNode(5);

		// 1->3->5 LinkedList created
		ListNode head2 = new ListNode(0);
		head2.next = new ListNode(2);
		head2.next.next = new ListNode(4);

		// 0->2->4 LinkedList created
		ListNode mergedhead = mergeTwoLists(head1, head2);

		//
		printList(mergedhead);

	}

}
