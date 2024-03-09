class Solution {
    static List<List<Integer>> arr;
    public void helper(int i, int[] nums, List<Integer> ans){
        if(i==nums.length){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0; j<ans.size(); j++){
                list.add(ans.get(j));
            }
            arr.add(list);
            return;
        }
        helper(i+1,nums, ans);
        ans.add(nums[i]);
        helper(i+1, nums, ans);
        ans.remove(ans.size()-1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        helper(0,nums,ans);
        for(int i =0; i<arr.size();i++){
            for(int j =i+1; j<arr.size();j++){
                if (arr.get(i).equals(arr.get(j))){
                    arr.remove(j);
                    j--;
                }
            }
        }
        return arr;
    }
}
