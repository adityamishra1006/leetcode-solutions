class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i =0; i<n; i++){
            while(!st.isEmpty() && heights[st.peek()] <= heights[i]){
                res[st.peek()]++;
                st.pop();
            }
            if(!st.isEmpty()) res[st.peek()]++;
            st.push(i);
        }
        return res;
    }
}
