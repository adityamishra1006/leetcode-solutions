class Solution {
    public int fib(int n) {
        if(n==0) return 0;

        int fNum = 0;
        int sNum= 1;

        while(n>1){
            int temp = sNum;
            sNum = sNum + fNum;
            fNum = temp;
            n--;
        }
        return sNum;
    }
}
