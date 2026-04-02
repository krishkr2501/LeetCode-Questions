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
    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer> ls = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            ls.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(ls);
        temp = head;
        for(int i=0;i<ls.size();i++){
            temp.val = ls.get(i);
            temp = temp.next;
        }
        return head;
    }
}