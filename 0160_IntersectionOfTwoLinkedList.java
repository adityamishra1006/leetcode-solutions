public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        ListNode tempA = headA;
        while(tempA!=null){
            tempA=tempA.next;
            lenA++;
        }
        
        int lenB = 0;
        ListNode tempB = headB;
        while(tempB!=null){
            tempB=tempB.next;
            lenB++;
        }

        tempA = headA;
        tempB = headB;

        if(lenA>lenB){
            for(int i =1; i<=lenA-lenB; i++){
                tempA = tempA.next;
            }
        }
        else{
            for(int i =1; i<=lenB-lenA; i++){
                tempB = tempB.next;
            }
        }

        while(tempA!=tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
}
