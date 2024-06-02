class Solution {
    public int[][] rotate(int[][] matrix){
        int n = matrix.length;
        int[][] result = new int[n][n];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                result[j][n-1-i] = matrix[i][j];
            }
        }
        return result;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        
        for(int i = 0; i<4; i++){
            if(Arrays.deepEquals(mat, target)) return true;
            mat = rotate(mat);
        }

        return false;
    }
}
