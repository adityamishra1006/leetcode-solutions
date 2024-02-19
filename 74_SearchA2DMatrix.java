class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int i = 0, j = n-1;

        for(i = 0; i<m; i++){
            for(j =0; j<n; j++){
                if(matrix[i][j]==target) return true;
            }
        }
        return false;
    }
}
