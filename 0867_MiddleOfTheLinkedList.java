class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }

        int mid = len/2 +1;
        temp = head;

        for(int i =1; i<mid; i++){
            temp = temp.next;
        }
        return temp;
    }
}
