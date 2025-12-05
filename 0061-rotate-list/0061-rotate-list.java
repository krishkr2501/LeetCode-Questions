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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        else{
            int size = cntNode(head);
            ListNode temp = head;
            k = k % size;
            if(k == 0) return head;
            for(int i=1;i<size-k;i++){
                temp = temp.next;
            }
            ListNode rot = temp.next;
            temp.next = null;
            ListNode curr = rot;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = head;
            return rot;
        }
    }
    int cntNode(ListNode head){
        int cnt = 0;
        ListNode temp = head;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }
}