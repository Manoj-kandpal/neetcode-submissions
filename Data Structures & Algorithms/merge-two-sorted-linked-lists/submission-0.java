/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        if (list1 == null && list2 != null) {
            return list2;
        }
        if (list2 == null && list1 != null) {
            return list1;
        }

        if (list1 == null && list2 == null) return null;
        ListNode current1 = list1;
        ListNode current2 = list2;
        ListNode prev = null;

        // if (current1.val <= current2.val) {
        //     head = current1;
        // } else {
        //     head = current2;
        // }



        while(current1 != null && current2 != null) {
            while (current1 != null && current2 != null && current1.val <= current2.val) {
                if (head == null) {
                    head = current1;
                    prev = current1;
                    current1 = current1.next;
                } else {
                    prev.next = current1;
                    current1 = current1.next;
                    prev = prev.next;
                }
            }
            while (current1 != null && current2 != null && current2.val < current1.val) {
                if (head == null) {
                    head = current2;
                    prev = current2;
                    current2 = current2.next;
                } else {
                    prev.next = current2;
                    current2 = current2.next;
                    prev = prev.next;
                }
            }
        }

        if (current1 == null && current2 != null) {
            prev.next = current2;
        } else if (current2 == null && current1 != null) {
            prev.next = current1;
        }

        return head;
    }
}