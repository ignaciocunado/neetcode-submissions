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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = lengthOfLinkedList(head);
        n = length - n + 1;

        if(n == 1) {
            head = head.next;
            return head;
        }

        ListNode prev = null;
        ListNode toRemove = head;
        while(n > 1) {
            prev = toRemove;
            toRemove = toRemove.next;
            n--;
        }

        prev.next = toRemove.next;

        return head;
    }

    private static int lengthOfLinkedList(ListNode head) {
        int length = 0;

        while(head != null) {
            head = head.next;
            length++;
        }

        return length;
    }
}
