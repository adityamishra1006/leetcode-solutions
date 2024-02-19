class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1};
        int n = nums.length;

        int lo =0, hi = n-1;
        boolean flag = false;

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid] == target){
                flag = true;
                break;
            }
            else if(nums[mid]>target) hi = mid-1;
            else lo = mid+1;
        }
        if(flag==false) return ans;

        lo = 0;
        hi = n-1;
        int lb = n;

        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid]>=target){
                lb = Math.min(lb, mid);
                hi = mid-1;
            }
            else lo = mid+1;
        }
        ans[0] = lb;


        lo = 0;
        hi = n-1;
        int ub = n;

        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid]>target){
                ub = Math.min(ub, mid);
                hi = mid-1;
            }
            else lo = mid+1;
        }
        ans[1] = ub-1;

        return ans;
    }
}
