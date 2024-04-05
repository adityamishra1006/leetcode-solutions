class Solution {
    public void reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode Next = null;

        while(curr!=null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode a = null, b = null, c = null, d = null;
        ListNode temp = head;
        int pos = 1;

        while(temp!=null){
            if(pos==left-1) a = temp;
            if(pos==left) b = temp;
            if(pos==right) c = temp;
            if(pos==right+1) d = temp;

            temp = temp.next;
            pos++;
        }
        if(a!=null) a.next = null;
        if(c!=null) c.next = null;
        reverse(b);
        if(a!=null) a.next = c;
        b.next = d;

        if(a==null) return c;
        return head;
    }
}
