class Solution {
    public int pivotInteger(int n) {
        int sum = 0;
        for(int i =1; i<=n; i++){
            sum+=i;
        }

        int sum2 = 0;
        for(int i =0; i<=n; i++){
            sum2+=i;
            if(sum2 == (sum-sum2+i)){
                return i;
            }
        }
        return -1;
    }
}
