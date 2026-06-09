class Solution {
    public boolean isSubsequence(String s, String t) {
    int s1 = s.length();
    int t1 = t.length();
    int k=0;
    if(s1>t1) return false;
    if(s1==0) return true;
        
    for(int i=0; i<t1; i++){
      if(k==s1) return true;
      if(t.charAt(i) == s.charAt(k))
            k++;
    }
    if(k==s1)  return true;
    else return false;
    }
}
