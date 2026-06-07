class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    int m=ransomNote.length();
    int n=magazine.length();
    int[] hash = new int[26];
    if(m>n) return false;
    for(int i=0; i<n; i++){
        hash[magazine.charAt(i)-97]++;
    }
    for(int i=0; i<m; i++){
      if(hash[ransomNote.charAt(i)-97] == 0) return false;
      hash[ransomNote.charAt(i)-97]--;
    }
    return true;
    }
}
