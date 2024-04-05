class Solution {
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode Next = null;

        while(curr!=null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        if(head==null) return 0;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        ListNode temp = null;

        while(fast!=null && fast.next!=null){ 
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reversed = reverse(slow);

        int ans = 0;
        ListNode i = head;
        ListNode j = reversed;

        while(i!=null && j!=null){
            ans = Math.max(ans, i.val+j.val);
            i = i.next;
            j = j.next;
        }
        return ans;
    }
}
