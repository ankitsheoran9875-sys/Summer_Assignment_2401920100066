class Solution {
    public int maxSubArray(int[] nums) {
        
int max=nums[0];
for(int i=1; i<nums.length; i++){
    if(nums[i] > max) max = nums[i];
}  
int sum = 0, maxSum= 0,neg=0;
        
for(int i=0; i<nums.length; i++){
    if(sum>maxSum) maxSum = sum;
    
    if(nums[i] >= 0) sum += nums[i];
    else{
     if(sum >= -1*nums[i]) sum+=nums[i];
     else sum = 0;
    neg++;
    }  
}
  if(neg == nums.length) return max;
  if(sum>maxSum) maxSum = sum;   
  return maxSum;
    }
}
