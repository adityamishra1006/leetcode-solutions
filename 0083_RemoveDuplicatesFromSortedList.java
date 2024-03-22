class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode i = head;
        ListNode j = head;

        while(j!=null){
            if(j.val==i.val){
                j = j.next;
            }else{
                i.next = j;
                i=j;
            }
        }
        i.next = null;
        return head;
    }
}
