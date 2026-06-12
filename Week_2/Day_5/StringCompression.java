class Solution {
    public int compress(char[] chars) {
      int n = chars.length, i = 0;
      String ans = "";
      
      for(i=0; i<n; ){
        int j = i+1, size =1;
        ans += chars[i];

        while(j<n && chars[i] == chars[j]){
            j++;
            size++;
        }
        if(size != 1) ans += size;
        i = j;
    }
    for(int k=0; k<ans.length(); k++){
       chars[k] = ans.charAt(k);
    }
    return ans.length();
    }
}
