class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ArrayList<Integer> ls = new ArrayList<>();
        ListNode curr = head; 
        while (curr != null) {
            if (curr.next != null && curr.val == curr.next.val) {
                int duplicateVal = curr.val;
                while (curr != null && curr.val == duplicateVal) {
                    curr = curr.next;
                }
            } else {
                ls.add(curr.val);
                curr = curr.next;
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        for (int i = 0; i < ls.size(); i++) {
            temp.next = new ListNode(ls.get(i));
            temp = temp.next;
        }
        return dummy.next;
    }
}
