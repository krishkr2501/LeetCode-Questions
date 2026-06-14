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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode prev = null;
        ListNode curr = slow;
        while (curr != null) {
            ListNode nxt = curr.next; 
            curr.next = prev;         
            prev = curr;              
            curr = nxt;               
        }
        
        fast = prev;
        slow = head;
        int sum = 0;
        while(fast != null){
            sum = Math.max(sum,(slow.val + fast.val));
            slow = slow.next;
            fast = fast.next;
        }
        return sum;
    }
}
