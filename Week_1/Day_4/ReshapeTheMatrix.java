class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       int m = mat.length, n=mat[0].length, a=0, b=0;
       if(m*n != r*c)  return mat;

       int[][] reshape = new int[r][c];
       for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            if(b==n){
                a++;
                b=0;
            }
            reshape[i][j] = mat[a][b++];
        }
       }
    return reshape;
    }
}
