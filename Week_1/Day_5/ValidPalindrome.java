class Solution {
    public boolean isPalindrome(String s) {
    int i=0, j=s.length()-1;
    while(i<=j){
     char a = s.charAt(i);
     char b = s.charAt(j);
     if(a == b){
         i++;
         j--;
     }
     else if(a>57 && b>57 && (a+32==b || a==b+32)){
         i++;
         j--;
     }
     else if(a<48 || a>122 || (a>90 && a<97) || (a>57 && a<65)) i++;
     else if(b<48 || b>122 || (b>90 && b<97) || (b>57 && b<65)) j--;
     else return false;
    }
    return true;
    }
}
