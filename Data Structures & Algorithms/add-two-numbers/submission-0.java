class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int n = getLength(l1), m = getLength(l2);

        if (m > n) {
            ListNode temp = l2;
            l2 = l1;
            l1 = temp;
        }

        ListNode iter1 = l1;
        ListNode iter2 = l2;
        ListNode prev = null;
        int carry = 0;

        while (iter1 != null && iter2 != null) {
            int sum = iter1.val + iter2.val + carry;
            iter1.val = sum % 10;
            carry = sum / 10;

            prev = iter1;
            iter1 = iter1.next;
            iter2 = iter2.next;
        }

        while (iter1 != null) {
            int sum = iter1.val + carry;
            iter1.val = sum % 10;
            carry = sum / 10;

            prev = iter1;
            iter1 = iter1.next;
        }

        if (carry != 0) {
            prev.next = new ListNode(carry);
        }

        return l1;
    }

    private int getLength(ListNode head) {
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        return length;
    }
}