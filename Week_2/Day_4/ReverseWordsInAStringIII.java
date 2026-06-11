class Solution {

   public String reverse(String s, int idx, int i){
    String p = "";
    while(i>=idx){
        p += s.charAt(i);
        i--;
    }
     return p;
   }
    
    public String reverseWords(String s) {
  int n = s.length(), idx = 0,i=0;
  String ans = "";
  while(i<n){
   if(s.charAt(i) == ' '){
        String part=reverse(s,idx,i-1);
        ans += part;
        ans += ' ';
        idx = i+1;
        i = idx;
    }
    else i++;
  }
    String part=reverse(s,idx,i-1);
    ans += part;
    return ans; 
    }
}
