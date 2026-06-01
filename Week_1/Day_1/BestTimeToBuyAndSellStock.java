class Solution {
    public int maxProfit(int[] prices) {
    int i=0, j=1;
    int ans = 0;
    while(j!=prices.length){
        if(prices[i] > prices[j]) i = j;
        else{
            if(prices[j] - prices[i] > ans) 
             ans = prices[j] - prices[i];
        }
        j++;
    }
        return ans;
    }
}
