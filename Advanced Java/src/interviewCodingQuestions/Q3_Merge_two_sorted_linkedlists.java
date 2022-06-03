package interviewCodingQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import leetCode.ListNode;

public class Q3_Merge_two_sorted_linkedlists {

	public static void main(String[] args) {
		/*
		 * ListNode head1 = new ListNode(1); head1.next = new ListNode(3);
		 * head1.next.next = new ListNode(5);
		 * 
		 * // 1->3->5 LinkedList created ListNode head2 = new ListNode(0); head2.next =
		 * new ListNode(2); head2.next.next = new ListNode(4);
		 * 
		 * // 0->2->4 LinkedList created ListNode mergedhead = mergeTwoLists(head1,
		 * head2);
		 * 
		 * // printList(mergedhead);
		 */

		int[] the = { 1, 2, 3 };
		Set<Integer> set1 = new HashSet<Integer>();
		ArrayList<Integer> arList1 = new ArrayList<Integer>();
		LinkedList<Integer> linkedList1 = new LinkedList<Integer>();

		HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();

		hashMap1.put(1, "hi");
		hashMap1.put(2, "test");
		hashMap1.put(null, null);

		// System.out.println(hashMap1);

		for (int i = 0; i < hashMap1.size(); i++) {
			if (hashMap1.containsKey(3)) {
				System.out.println(hashMap1.get(2));
			} else {
				System.out.println("Key not found.");
				break;
			}

		}

		for (int i = 0; i < 10; i++) {
			hashMap1.put(i, "test" + i);
		}
		HashMap<Integer, String> hashMap1Clone = new HashMap<Integer, String>();
		hashMap1Clone.putAll(hashMap1);
		System.out.println(hashMap1);
		System.out.println(hashMap1Clone);
		/*
		 * hashMap1Clone.putAll(hashMap1); -> clones whats in hashmap 1 into
		 * hashMap1Clone
		 */

	}

}
