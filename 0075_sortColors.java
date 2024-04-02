class Solution {
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp; 
     }
    
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0, mid = 0, hi = n-1;

        while(mid <= hi){
            if(nums[mid]==0){
                swap(nums,low, mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1) mid++;

            else{
                swap(nums, mid, hi);
                hi--;
            }
        }    
    }
}
