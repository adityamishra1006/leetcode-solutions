class Solution {
    public boolean isPossible(int max, long n, int[] arr){
        long hours = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % max == 0) {
                hours += arr[i] /(long)max;
             } else {
                hours += arr[i] / (long)max + 1;
            }
        }   
        if (hours <= n) {
            return true;
        }
    return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int mx = Integer.MIN_VALUE;

        for(int i =0; i<n; i++){
            mx = Math.max(mx, piles[i]);
        }
        int lo = 1; int hi = mx;

        int ans = 0; 
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(isPossible(mid, h, piles)==true){
                ans = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return ans;
    }
}
