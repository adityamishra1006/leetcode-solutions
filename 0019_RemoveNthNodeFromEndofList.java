class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int len = 0;
        while(temp!=null){
            temp = temp.next;
            len++;
        }

        if(len==n) return head.next;

        int remPos = len - n +1;

        temp = head;
        for(int i=1; i<remPos-1; i++){
            temp = temp.next;
        } 
        temp.next = temp.next.next;
        return head;
    }
}
