class Solution {
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void computePermutation(int index, int[] nums, List<List<Integer>> ans){
        if(index >= nums.length){
            List<Integer> list = new ArrayList<>();
            for(int e : nums){
                list.add(e);
            }
            ans.add(list);
            return;
        }

        for(int i = index; i<nums.length; i++){
            swap(nums, i, index);
            computePermutation(index+1, nums, ans);
            swap(nums, i, index);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        computePermutation(0, nums, ans);
        return ans;
    }
}
