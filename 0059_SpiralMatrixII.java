class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int num = 1;
        int minC = 0, maxC =n-1;
        int minR = 0, maxR = n-1;

        while(minC<=maxC && minR<=maxR){
            for(int j = minC; j<=maxC; j++){
                matrix[minR][j] = num++;
            }
            minR++;
            if(minR>maxR || minC>maxC) break;

            for(int i = minR; i<=maxR; i++){
                matrix[i][maxC] = num++;
            }
            maxC--;
            if(minR>maxR || minC>maxC) break;

            for(int j = maxC; j>=minC;j--){
                matrix[maxR][j] = num++;
            }
            maxR--;
            if(minR>maxR || minC>maxC) break;

            for(int i = maxR;i>=minR;i--){
                matrix[i][minC] = num++;
            }
            minC++;
            if(minR>maxR || minC>maxC) break;
        }
        return matrix;
    }
}
