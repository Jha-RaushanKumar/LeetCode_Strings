class Solution {
    
    public List<String> generateParenthesis(int n) {

        //Approach1 -- TC:O(2^N) SC:O(N)
        List<String> ls = new ArrayList<>();
        generateParenthesisHelper(0,0,n,"",ls);
        return ls;        
    }

    public void generateParenthesisHelper(int open, int close, int max, String s, List<String> ans) {

        if(s.length() == 2*max){
            ans.add(s);
            return;
        }
        if(open<max){
            generateParenthesisHelper(open+1, close, max, s+"(", ans);
        }
        if(close<open){
            generateParenthesisHelper(open, close+1, max, s+")", ans);
        }    
    }
}