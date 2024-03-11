class Solution {
    static List<String> ans;
    public void printParentheses(int open, int close, int n, String s){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }

        if(open<n) printParentheses(open+1, close, n, s+"(");
        if(close<open) printParentheses(open, close+1, n, s+")");
    }
    public List<String> generateParenthesis(int n) {
        ans = new ArrayList<>();
        printParentheses(0,0,n,"");
        return ans;
    }
}
