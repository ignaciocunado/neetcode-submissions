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
        ListNode newHead = new ListNode(-1);
        ListNode node = newHead;

        ListNode node1 = list1;
        ListNode node2 = list2;

        while(node1 != null && node2 != null) {
            if(node1.val < node2.val) {
                node.next = new ListNode(node1.val);
                node = node.next;
                node1 = node1.next;
            }
            else {
                node.next = new ListNode(node2.val);
                node = node.next;
                node2 = node2.next;
            }
        }

        while(node1 != null) {
            node.next = new ListNode(node1.val);
            node1 = node1.next;
            node = node.next;
        }
        while(node2 != null) {
            node.next = new ListNode(node2.val);
            node2 = node2.next;
            node = node.next;
        }

        return newHead.next;
    }
}