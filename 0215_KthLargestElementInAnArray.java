class Solution {
    static int ans;
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int partition(int[] arr, int lo, int hi){
        int mid = (lo+hi)/2;
        int pivot = arr[mid], pivotIdx = mid;
        int smallerCount = 0;

        for(int i =lo; i<= hi; i++){
            if(i==mid) continue;
            if(arr[i]<=pivot) smallerCount++;
        }
        int correctIdx = lo + smallerCount;
        swap(arr, correctIdx, pivotIdx);

        int i =lo, j = hi;
        while(i<correctIdx && j>correctIdx){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot){
                swap(arr,i,j);
            }
        }
        return correctIdx;
    }
    public void quickSelect(int[] arr, int lo, int hi, int k){
        if(lo>hi) return;
        int idx = partition(arr, lo, hi);
        if(idx == k-1){
            ans = arr[idx];
            return;
        }
        else if(k-1<idx) 
            quickSelect(arr,lo, idx-1,k);
        else 
            quickSelect(arr,idx+1,hi,k);
    }
    public int findKthLargest(int[] nums, int k) {
        ans = -1;
        int n = nums.length;
        quickSelect(nums,0,n-1,n-k+1);
        return ans;
    }
}
