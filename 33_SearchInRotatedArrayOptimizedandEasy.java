class Solution {
    public int search(int[] arr, int key) {
        int n = arr.length;

        int lo =0; int hi = n-1;

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==key) return mid;
            else if(arr[mid]<=arr[hi]){
                if(key>arr[mid] && key<=arr[hi]) lo = mid +1;
                else hi = mid-1;
            }
            else{
                if(key>=arr[lo] && key<arr[mid]) hi = mid-1;
                else lo = mid+1;
            }
        }
        return -1;
    }
}
