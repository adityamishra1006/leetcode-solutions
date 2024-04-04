class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode a = new ListNode(-1);        
        ListNode b = new ListNode(-1);

        ListNode tempA = a;
        ListNode tempB = b;
        ListNode temp = head;

        while(temp!=null){
            if(temp.val<x){
                tempA.next = temp;
                tempA = tempA.next;
            }
            else{
                tempB.next = temp;
                tempB = tempB.next;
            }
            temp = temp.next;
        }        
        tempA.next = b.next;;
        tempB.next  = null;
        

        return a.next;
    }
}
