class Solution {

    public boolean strCheck(int[] a1, int[] a2){
      for(int i=0; i<25; i++){
        if(a1[i] != a2[i]) return false;
      }
      return true;
   }
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> ans = new ArrayList<>();
        int[] hash1 = new int[26];
        int[] hash2 = new int[26];

        if(p.length() > s.length()) return ans;
        
        for(int i=0; i<p.length(); i++){
            hash1[p.charAt(i) - 97]++;
        }
        int j = 0,i=0,start=0;

        for(j=0; j<p.length(); j++){
            hash2[s.charAt(j) - 97]++;
        }

        for(i=0; i<(s.length()-p.length() ); i++){
            boolean check = strCheck(hash1, hash2);
            if(check == true) ans.add(i);

            hash2[s.charAt(i)-97]--;
            hash2[s.charAt(i+p.length())-97]++;
            start++;
        }

    boolean check = strCheck(hash1, hash2);
    if(check == true) ans.add(i);

    return ans;
  }
}
