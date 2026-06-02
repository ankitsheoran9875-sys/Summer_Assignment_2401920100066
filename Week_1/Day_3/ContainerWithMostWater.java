class Solution {
    public int maxArea(int[] height) {
    int max = 0,finalMax=-1;
    int i=0, j=height.length-1;
    while(i<j){
        max = (j-i)* Math.min(height[i], height[j] );
        if(max>finalMax) finalMax=max;
        
        if(height[i] < height[j]) i++;
        else j--;
    }
    return finalMax;
    }
}
