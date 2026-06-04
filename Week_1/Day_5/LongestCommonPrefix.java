class Solution {
    public String longestCommonPrefix(String[] strs) {
 int k=0;
 String ans = "";
 while(true){
    if(strs[0].length() == k) 
        return ans;
    char add = strs[0].charAt(k);
    for(int i=0; i<strs.length-1; i++){
     if(k>=strs[i].length() || k>=strs[i+1].length() ) return ans;
     if(strs[i].charAt(k) != strs[i+1].charAt(k) ) return ans;
    }
    ans += add;
    k++;
 }
    }
}
