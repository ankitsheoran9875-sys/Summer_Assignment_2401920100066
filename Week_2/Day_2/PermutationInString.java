class Solution {

   public boolean strCheck(int[] a1, int[] a2){
      for(int i=0; i<25; i++){
        if(a1[i] != a2[i]) return false;
      }
      return true;
   }

    public boolean checkInclusion(String s1, String s2) {
        int[] hash1 = new int[26];
        int[] hash2 = new int[26];

        if(s1.length() > s2.length()) return false;

        for(int i=0; i<s1.length(); i++){
            hash1[s1.charAt(i) - 97]++;
        }

        int j = 0,start=0;

        for(j=0; j<s1.length(); j++){
            hash2[s2.charAt(j) - 97]++;
        }

        for(int i=j; i<s2.length(); i++){
         boolean check = strCheck(hash1, hash2);
         if(check == true) return true;
         else{
            hash2[s2.charAt(start)-97]--;
            hash2[s2.charAt(i)-97]++;
            start++;
         }
        }
    return strCheck(hash1, hash2);
    }
}
