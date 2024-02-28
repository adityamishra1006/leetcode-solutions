class Solution {
    public boolean totalTrip(long maxT, long n, int[] arr) {
        int m = arr.length;
        long trip = 0; 
        for (int i = 0; i < m; i++) {
            trip += maxT / (long) arr[i]; 
        }
        if (trip >= n) return true;
        return false;
    }
    public long minimumTime(int[] time, int t) {
        int n = time.length;
        long min = Long.MAX_VALUE;
        long sum = 0;
        for(int i =0; i<n; i++){
            min = Math.min(min,time[i]);
            sum+=time[i];
        }
        long lo =0;  long hi = min * t;
        long ans = sum;
        while(lo<=hi){
            long mid = lo + (hi-lo)/2;
            if(totalTrip(mid,t,time)){
                ans = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return ans;
    }
}
