class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        int lp = 1;
        for(int i =0; i<n; i++){
            arr[i] = lp;
            lp*=nums[i];
        }

        int rp =1;
        for(int i =n-1; i>=0; i--){
            arr[i] *= rp;
            rp*=nums[i];
        }
        
        return arr;
    }
}
