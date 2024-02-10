class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int minr = 0, maxr = m-1;
        int minc = 0, maxc = n-1;

        List<Integer> result = new ArrayList<>();

        while(minr<=maxr && minc<=maxc){
            // top left to top right
            for(int j =minc ;j <=maxc ; j++){
                result.add(matrix[minr][j]);
            }
            minr++;
            if(minr>maxr || minc>maxc) break;

            // top right to bottom right
            for(int i =minr; i<=maxr; i++){
                result.add(matrix[i][maxc]);
            }
            maxc--;
            if(minr>maxr || minc>maxc) break;

            // bottom right to bottom left
            for(int j =maxc ;j >=minc ; j--){
                result.add(matrix[maxr][j]);
            }
            maxr--;
            if(minr>maxr || minc>maxc) break;

            // left bottom to left top 
            for(int i =maxr; i>=minr; i--){
                result.add(matrix[i][minc]);
            }
            minc++;
        }
        return result;
    }
}
