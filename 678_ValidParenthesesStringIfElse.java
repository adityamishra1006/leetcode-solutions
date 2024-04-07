class Solution {
    public boolean checkValidString(String s) {
        int low = 0;
        int high = 0;

        for(final char c : s.toCharArray()){
            if(c=='('){
                ++low;
                ++high;
            }
            if(c==')'){
                low = Math.max(0, --low);
                high--;
            }
            if(c=='*'){
                low = Math.max(0, --low);
                ++high;
            }
            
            if(high<0) return false;
        }
        return low == 0;
    }
}
