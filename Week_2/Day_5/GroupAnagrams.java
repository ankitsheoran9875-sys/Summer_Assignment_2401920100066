class Solution {

    public boolean check(int[] hash, String s, int checkLen){
        if(s.length() != checkLen) return false;
        int[] hash2 = new int[26];
        for(int i=0; i<s.length(); i++){
            hash2[ s.charAt(i) - 97]++;
        }
        for(int i=0; i<26; i++){
            if(hash[i] != hash2[i]) return false;
        }
        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        
      List<List<String>> ans = new ArrayList<>();

      for(int i=0; i<strs.length; i++){
            if(strs[i] == "0" || strs[i] == "") continue;
            else{
                List<String> subAns = new ArrayList<>();
                int[] hash = new int[26];
                int length = strs[i].length();
                subAns.add(strs[i]);

                for(int k=0; k<strs[i].length(); k++)   
                    hash[ strs[i].charAt(k) - 97 ] ++;
                
                for(int j=i+1; j<strs.length; j++){
                    if(strs[j] == "0" || strs[j] == "") continue;
                    boolean flag = check(hash, strs[j], length);
                    if(flag == true){
                        subAns.add(strs[j]);
                        strs[j] = "0";
                    }
                }
                ans.add(subAns);
            }
        }
      return ans;
    }
}
