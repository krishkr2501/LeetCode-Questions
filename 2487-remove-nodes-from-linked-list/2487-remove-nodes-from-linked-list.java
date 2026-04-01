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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            st.push(temp);
            temp = temp.next;
        }
        Stack<ListNode> stn = new Stack<>();
        stn.push(st.pop());
        while(!st.isEmpty()){
            ListNode currentNode = st.peek(); 
            if(stn.peek().val <= currentNode.val){
                stn.push(currentNode);
            }
            st.pop(); 
        }
        ListNode newHead = new ListNode(-1);
        temp = newHead;
        while(!stn.isEmpty()){
            temp.next = stn.pop();
            temp = temp.next;
        }
        return newHead.next;
    }
}