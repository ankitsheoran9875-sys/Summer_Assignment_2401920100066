class Solution {

public boolean verify(String s, int l){
  for(int i=l; i<s.length(); i++){
      int j=0;
      while(j<l){
        if(s.charAt(i) != s.charAt(j))
            return false;
        j++;
        i++;
      }
    i--;
  }
   return true;
 }
    
 public boolean repeatedSubstringPattern(String s) {
    int n = s.length();
    if(n==1) return false;
    char check = s.charAt(0);
    for(int i=1; i<n; i++){
      if(s.charAt(i) == check){
        int length = i;
        if(n % length != 0) continue;
        boolean f = verify(s,length);
        if(f==true) return true;
      }
    }
    return false;
    }
}
