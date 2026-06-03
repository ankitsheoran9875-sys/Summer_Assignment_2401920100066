class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

     List<Integer> ans = new ArrayList<>();
      int fRow = 0, lRow =  matrix.length - 1;
      int fCol = 0, lCol = matrix[0].length - 1;

    while(fRow <= lRow || fCol <= lCol){
        
      if(fCol > lCol) break;
      for(int i=fCol; i<=lCol; i++){
       ans.add( matrix[fRow][i] );
      }
      fRow++;
      if(fRow > lRow) break;
      for(int i = fRow; i<=lRow; i++){
        ans.add( matrix[i][lCol] );
      }
      lCol--;
      if(fCol > lCol) break;
      for(int i=lCol; i>=fCol; i--){
        ans.add( matrix[lRow][i] );
      }
      lRow--;
      if(fRow > lRow) break;
      for(int i=lRow; i>=fRow; i--){
        ans.add( matrix[i][fCol] );
      }
      fCol++;
    }
   return ans;
    }
}
