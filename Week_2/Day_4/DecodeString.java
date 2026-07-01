class Solution {

    public String decode(String s, int a){
        String s1 = "";
        for(int i=1; i<=a; i++){
            s1 += s;
        }
        return s1;
    }
    public String reverse(String str){
        int n = str.length()-1;
        String s2 = "";
        for(int i=n; i>=0; i--){
            s2 += str.charAt(i);
        }
        return s2;
    }
        
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();
        int n=s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i) == ']'){
                String temp = "";
                while(st.peek().charAt(0) != '['){
                    temp += st.peek();
                    st.pop();
                }
                st.pop();
                int a = Integer.valueOf(st.pop());
                String subans = decode(temp, a);
                st.push(subans);
            }
            else{
                String k = "";
                k += s.charAt(i);
                if(s.charAt(i)>= 48 && s.charAt(i) <=57){
                    while(s.charAt(i+1)>=48 && s.charAt(i+1)<=57){
                        k += s.charAt(i+1);
                        i++;
                    }
                }
                st.push(k);
            }
        }

        String ans = "";
        while(st.size()>0) ans += st.pop();
        
        return reverse(ans);
    }
}
