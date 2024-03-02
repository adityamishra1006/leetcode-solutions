class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count  =0;

        for(int i =0; i<n-1; i++){
            if(nums[i]>nums[i+1]){
                count++;
            }
        }

        if(nums[n-1]>nums[0]){
            count++;
        }

        if(count<=1) return true;
        return false;
    }
}
