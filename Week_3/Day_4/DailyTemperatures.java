class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        int[] hash = new int[101];
        Stack<Integer> st = new Stack<>();

        ans[n-1] = 0;
        hash[temperatures[n-1]] = n-1;
        st.push(temperatures[n-1]);

        for(int i=n-2; i>=0; i--){
           while(st.size() > 0 && st.peek() <= temperatures[i]) st.pop();
           if(st.size() == 0) ans[i] = 0;
           else{
              int idx = st.peek();
              ans[i] = hash[idx] - i;
           }
           st.push(temperatures[i]);
           hash[temperatures[i] ] = i;
        }
        return ans; 
    }
}
