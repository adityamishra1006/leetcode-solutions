class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for(int i = 0; i< m; i++){
            if(grid[i][0]==0){
                for(int j =0 ; j<n; j++){
                    if(grid[i][j]==0) grid[i][j] = 1;
                    else grid[i][j] = 0;
                }
            }
        }
        for(int j =1; j< n; j++){
            int noOfZeroes = 0; 
            int noOfOnes = 0; 

            for(int i = 0; i<m; i++){
                if(grid[i][j]==0) noOfZeroes++;
                else noOfOnes++;
            }
            if(noOfZeroes>noOfOnes){
                for(int i =0; i<m; i++){
                    if(grid[i][j]==0) grid[i][j]=1;
                    else grid[i][j]=0;
                }
            }
        }
        int score =0;
        int x =1;

        for(int j = n-1; j>=0; j--){
            for(int i =0; i<m; i++){
                score+=grid[i][j]*x;
            }
            x*=2;
        }
        return score;
    }
}
