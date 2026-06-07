class Solution {
    public boolean isAnagram(String s, String t) {
    int l1 = s.length(), l2=t.length();
    if(l1 != l2) return false;
        
    int[] hash = new int[26];
    for(int i=0; i<l1; i++){
        hash[s.charAt(i)-97]++;
    }
    for(int i=0; i<l2; i++){
        hash[t.charAt(i)-97]--;
    }
    for(int i=0; i<26; i++){
        if(hash[i] != 0) return false;
    }
    return true;
    }
}
