class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int sum =0;
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0; i<n ;i++){
            sum+=nums[i] == 0?-1:1;
            if(sum==0) res = i+1;
            else if(!map.containsKey(sum)){
               map.put(sum, i);
            }
            else{
                res = Math.max(res, i- map.get(sum));
            }
        }
        

        return res;
    }
}
