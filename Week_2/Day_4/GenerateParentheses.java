class Solution {
  public void parenthesis(String s,int n,int open,int close, List<String> ans){
      
if(close == n){
    ans.add(s);
    return;
}
if(open<n)
parenthesis(s+"(",n,open+1,close,ans);
if(close<open)
parenthesis(s+")",n,open,close+1,ans);
  }
    
    public List<String> generateParenthesis(int n) {

List<String> ans = new ArrayList<>();

String s = "";
parenthesis(s,n,0,0,ans);
return ans;
    }
}
