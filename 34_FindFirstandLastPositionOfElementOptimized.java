class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int n = nums.length;
        int lo =0;
        int hi = n-1;

        // First Position

        int fp =-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid]==target){
                if(mid>0 && nums[mid]==nums[mid-1]){
                    hi=mid-1;
                }else{
                    fp = mid;
                    lo=mid+1;
                }
            }
            else if(nums[mid]>target) hi = mid-1;
            else lo = mid+1;
        }

        lo =0;
        hi = n-1;


        // Last Position
        int lp =-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid]==target){
                if(mid+1<n && nums[mid]==nums[mid+1]){
                    lo=mid+1;
                }else{
                    lp =mid;
                    hi=mid-1;
                }
            }
            else if(nums[mid]>target) hi = mid-1;
            else lo = mid+1;
        }

        ans[0] = fp;
        ans[1] = lp;

        return ans;
    }
}
