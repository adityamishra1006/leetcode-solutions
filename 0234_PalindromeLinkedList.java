class Solution {
    public ListNode reverseList(ListNode head){
        ListNode c = head;
        ListNode p = null;
        ListNode n = null;

        while(c!=null){
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        return p;
    }
    public boolean isPalindrome(ListNode head) {
        if(head.next==null) return true;
        ListNode newHead = new ListNode(head.val);
        ListNode t1 = head.next;
        ListNode t2 = newHead;

        while(t1 != null){
            ListNode temp = new ListNode(t1.val);
            t2.next = temp;
            t2 = t2.next;
            t1 = t1.next;
        }
        newHead = reverseList(newHead);
        t1 = head;
        t2 = newHead;
        while(t1!=null){
            if(t1.val!=t2.val) return false;
            t2 = t2.next;
            t1 = t1.next;
        }
        return true;
    }
}
