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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode ptr1 = head;
        ListNode ptr2 = head.next;
        while(ptr2 != null){
            rev(ptr1,ptr2);
            ptr1 = ptr2.next;
            if(ptr1 != null){                  
                ptr2 = ptr1.next;
            } else {
                ptr2 = null;
            }
        }
        return head;
    }
    private void rev(ListNode ptr1,ListNode ptr2){
        int temp = ptr1.val;
        ptr1.val = ptr2.val;
        ptr2.val = temp;
    }
}