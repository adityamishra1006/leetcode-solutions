class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        
        int i = 0; 
        int j = 0;
        int k = 0;

        int[] merge = new int[m+n];

        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                merge[k++] = nums1[i++];
            }
            else{
                merge[k++] =nums2[j++];
            }
        }
        while(i<m){
            merge[k++]=nums1[i++];
        }
        while(j<n){
            merge[k++] = nums2[j++];
        }

        int x = merge.length;

        if(x %2 == 0){
            int z = x / 2;
            int e = merge[z-1];
            int q = merge[z];
 
            double ans = (double)(e + q)/2.0;
            return ans;
        }
        else{
            int z = x / 2;
            return merge[z];
        }
    }
}
