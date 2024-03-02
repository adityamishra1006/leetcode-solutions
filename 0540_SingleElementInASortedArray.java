class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int lo = 0, hi = n-1;
        int count=0;

        if(hi==0) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[hi-1]!=nums[hi]) return nums[hi];

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            else if((mid%2==0)&&nums[mid]==nums[mid+1] || (mid%2==1)&&nums[mid]==nums[mid-1]) lo = mid + 1;
            else hi = mid-1;
        }
        return 0;
    }
}
