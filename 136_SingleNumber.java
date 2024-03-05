class Solution {
    public int singleNumber(int[] arr) {
        int n = arr.length;
        int x = 0; 
        
        for(int num:arr){
            x^=num;
        }
        return x;
    }
}
