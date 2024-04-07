class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode left = head;
        ListNode mid = head.next;
        ListNode right = head.next.next;
        
        int[] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;

        int idx = 1;
        int first = -1, last = -1;
        int minDist = Integer.MAX_VALUE;

        while(right!=null){
            if(mid.val>left.val && mid.val>right.val || mid.val<left.val && mid.val<right.val){
                if(first==-1) first = idx;
                if(last!=-1){
                    int dist = idx - last;
                    minDist = Math.min(minDist, dist);
                }
                last = idx;
            }
            idx++;
            left = left.next;
            mid = mid.next;
            right = right.next;
        }
        int maxDist = last - first;
        if(first==last) return arr;

        arr[0] = minDist;
        arr[1] = maxDist;

        return arr;
    }
}
