class Solution {
    public int diagonalSum(int[][] mat) {
int n=mat.length,a=(n-1)/2;
int ans = 0;
for(int i=0; i<n; i++)
 ans += mat[i][i] + mat[i][n-1-i];

if(n%2==0) return ans;
else return ans - mat[a][a];
    }
}
