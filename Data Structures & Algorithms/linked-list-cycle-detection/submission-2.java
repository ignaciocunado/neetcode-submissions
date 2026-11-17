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
        ListNode fast = head;
        ListNode slow = head;

        while(true) {
            if (fast == null || slow == null || slow.next == null || fast.next == null || fast.next.next == null) {
                return false;
            }
            
            slow = slow.next;
            fast = fast.next.next;

            if(fast.val == slow.val) {
                return true;
            }
        }
    }
}
