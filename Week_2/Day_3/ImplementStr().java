class Solution {

   public boolean check(String h, String n,int idx){

  if(h.length()-idx < n.length())
      return false;
       
   for(int i=0; i<n.length(); i++){
    if(h.charAt(idx++) != n.charAt(i))
        return false;
    }
    return true;
   }
    
    public int strStr(String haystack, String needle) {
    int m = haystack.length();
    int n = needle.length();
    if(n>m) return -1;
    for(int i=0; i<m; i++){
     if(haystack.charAt(i) == needle.charAt(0)){
      boolean flag = check(haystack,needle,i);
      if(flag == true) return i;
     }
    }
    return -1;
    }
}
