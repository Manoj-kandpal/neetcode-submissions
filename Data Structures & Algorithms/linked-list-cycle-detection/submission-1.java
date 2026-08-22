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
    public boolean hasCycle(ListNode head) {

        if (head == null) return false;

        ListNode single = head;
        ListNode other = head.next;

        if (other != null){
            other = other.next;
        }

        if (single == null || other == null) return false;

        while (!single.equals(other) && single != null && other != null) {
            single = single.next;

            other = other.next;

            if (other != null) {
                other = other.next;
            } else {
                return false;
            }
        }

        if (single == null || other == null) return false;

        return true;
    }
}
