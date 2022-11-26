/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode hasCycle(ListNode head) {
        if (head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        do {
            if (slow.next != null)
                slow = slow.next;
            else return null;
            if (fast.next != null) {
                if (fast.next.next != null)
                    fast = fast.next.next;
                else return null;
            }
            else return null;
        } while(fast != slow && fast != null );
        if (fast==null)
            return null;
        return fast;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode intersection = hasCycle(head);
        if (intersection == null)
            return null;
        while(head != intersection) {
            head = head.next;
            intersection = intersection.next;
        }
        return head;
    }
}