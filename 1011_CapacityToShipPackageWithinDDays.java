class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int mx = Integer.MIN_VALUE;
        int sum = 0;

        for(int i =0;  i<n; i++){
            mx = Math.max(mx,weights[i]);
            sum+=weights[i];
        }

        int lo = mx, hi = sum, minC = sum;

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(isPossible(mid, weights, days)==true){
                minC = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return minC;
    }

    public boolean isPossible(int c,int[] arr, int d){
        int n = arr.length;
        int load =0;
        int days = 1;

        for(int i =0;  i<n; i++){
            if(arr[i]+load <= c) load +=arr[i];
            else{
                load = arr[i];
                days++;
            } 
        }
        if(days>d) return false;
        return true;
    }
}
