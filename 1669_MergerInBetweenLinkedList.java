class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode tempA = list1;
        for(int i =0; i<a-1;++i){
            tempA = tempA.next;
        }
        ListNode tempB = tempA.next;
        for(int i = 0; i < b - a; ++i){ 
            tempB = tempB.next;
        }
        tempA.next = list2;
        ListNode endTempB = list2;
        while(endTempB.next != null){
            endTempB = endTempB.next;
        }
        endTempB.next = tempB.next;
        tempB.next = null;

        return list1;
    }
}
