class Solution {

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int majorityElement(int[] arr) {
        int n = arr.length;
        // Arrays.sort(nums);

        for(int i =1; i<n; i++){
            int j = i;
            while(j>=1 && arr[j]>arr[j-1]){
                swap(arr, j, j-1);
                j--;
            }
        }
        return arr[n/2];
    }
}
