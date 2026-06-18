class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int ans = -1;
        for(int i=0; i<tokens.length; i++){
            char ch = tokens[i].charAt(0);
            int l = tokens[i].length();
            if((ch == '+' || ch == '-' || ch == '*' || ch == '/') && l == 1){
                if(ch == '+')  ans = st.pop() + st.pop();
                else if(ch == '-'){
                    int a = st.pop();
                    int b = st.pop();
                    ans = b - a;
                }
                else if(ch == '*')  ans = st.pop() * st.pop();
                else{
                  int a = st.pop();
                  int b = st.pop();
                  ans = b / a;
                }
                st.push(ans);
                }
            else{
                int a = Integer.valueOf(tokens[i]);
                st.push(a);
            }
        }

    return st.peek(); 
    }
}
