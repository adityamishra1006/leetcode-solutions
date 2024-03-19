class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = null;
        ListNode fast = null;

        for(ListNode curr = head;curr!=null; curr = curr.next){
            if(fast!=null){
                fast = fast.next;
            }
            if(--k==0){
                slow = curr;
                fast = head;
            }
        }
        int temp = slow.val;
        slow.val = fast.val;
        fast.val = temp;

        return head;
    }
}
