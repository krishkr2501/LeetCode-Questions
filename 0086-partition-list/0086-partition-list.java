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
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0, head);
        ListNode a = dummy; 
        while (a.next != null && a.next.val < x) {
            a = a.next;
        }

        ListNode b = a.next; 
        if (b == null) return head; 

        while (b.next != null) {
            ListNode c = b.next; 
            if (c.val < x) {
                // To keep relative order, we pluck 'c' out and move it to after 'a'
                b.next = c.next;
                c.next = a.next;
                a.next = c;
                a = a.next; // Move 'a' forward so the next 'small' node stays behind 'c'
            } else {
                b = b.next;
            }
        }
        return dummy.next;
    }
}