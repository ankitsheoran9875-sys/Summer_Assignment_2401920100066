class Solution {
    public double findMaxAverage(int[] nums, int k) {
    double ans = 0;
    int sum = 0,i=0,start=0,finalSum;
    for(i=0; i<k; i++){
        sum += nums[i];
    }
        
    finalSum = sum;
    for(int j=i; j<nums.length; j++){
      sum -= nums[start++];
      sum += nums[j];
      if(sum>finalSum) finalSum = sum;
    }
     return (double)finalSum/k;
    }
}
