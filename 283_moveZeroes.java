class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        // int noOfZeroes = 0;

        // for(int ele : nums){
        //     if(ele == 0) noOfZeroes++;
        // }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-1-i; j++){
                if(nums[j] == 0){
                    int temp = nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}
