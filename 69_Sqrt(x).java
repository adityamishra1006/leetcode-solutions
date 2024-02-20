class Solution {
    public int mySqrt(int x) {
        long lo =0, hi =x;
        while(lo<=hi){
            long mid = lo + (hi-lo)/2;

            if(mid*mid==(long)x) return (int)mid;

            else if(mid*mid>(long)x) hi = mid-1;

            else lo = mid+1;
        }
        return (int)hi;
    }
}
