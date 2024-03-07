class Solution {
    public double myPow(double a, int b) {
        if(b==0) return 1;

        if(b<0){
            return 1/(a*myPow(a,-b-1));
        }

        double ans = myPow(a,b/2);

        if(b%2==0) return ans * ans;
        else return a*ans * ans;
    }
}
