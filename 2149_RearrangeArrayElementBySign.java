class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n];
        int[] neg = new int[n];
        int posCount = 0;
        int negCount = 0;

        for(int i =0; i<n; i++){
            if(nums[i]<0){
                neg[negCount++]=nums[i];
            }
            else{
                pos[posCount++]=nums[i];
            }
        }

        int i =0, j= 0, k= 0;
        Arrays.sort(nums);

         while(i < posCount && j < negCount){
                nums[k++] = pos[i++];
                nums[k++] = neg[j++];
        }

        while(i<posCount){
            nums[k++] = pos[i++];
        }
        while(j<negCount){
            nums[k++] = neg[j++];
        }

        return nums;
    }
}
