class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long totalCount = 0;
        int lastMinIdx = -1;
        int lastMaxIdx = -1;
        int lastInvalidIdx = -1;

        for(int curr = 0; curr<nums.length;++curr){
            if(nums[curr]<minK || nums[curr]>maxK){
                lastInvalidIdx = curr;
            }
            if(nums[curr]==minK) lastMinIdx = curr;

            if(nums[curr]==maxK) lastMaxIdx = curr;

            totalCount += Math.max(0, Math.min(lastMinIdx, lastMaxIdx)-lastInvalidIdx);
        }

        return totalCount;
    }
}
