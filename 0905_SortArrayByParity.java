class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int index = 0;
        int[] res = new int[n];
        for(int i : nums){
            if(i%2==0){
                res[index] = i;
                index++;
            }
        }
        for(int i : nums){
            if(i%2==1){
                res[index] = i;
                index++;
            }
        }
        return res;
    }
}
