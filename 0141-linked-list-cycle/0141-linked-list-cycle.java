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
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        do {
            if (slow.next != null)
                slow = slow.next;
            else return false;
            if (fast.next != null) {
                if (fast.next.next != null)
                    fast = fast.next.next;
                else return false;
            }
            else return false;
        } while(fast != slow && fast != null );
        if (fast==null)
            return false;
        return true;
    }
}