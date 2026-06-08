class Solution {
    public int lengthOfLongestSubstring(String s) {
int[] hash = new int[200];
int i=0, j=0, n=s.length(), ans=0;
        
while(j!= n){
    
    while(j<n && hash[s.charAt(j)] == 0){
        hash[s.charAt(j)] = 1;
        j++;   
    }
    if(j-i > ans) ans = j-i;
    hash[s.charAt(i)] = 0;
    i++;
}
    return ans;
    }
}
