class Solution {
    public int minimumLength(String s) {
       int n = s.length();
       int i = 0, j = n-1;
       if(n<=2) return n;
       else{
            while(i<j && s.charAt(i)==s.charAt(j)){
                char ch = s.charAt(i);
                while(i<=j && s.charAt(i)==ch){
                    i++;
                }
                while(i<=j && s.charAt(j)==ch){
                    j--;
                }
            }
            int x  = Math.max(0,j-i+1);
            return x;
        }   
    }
}
