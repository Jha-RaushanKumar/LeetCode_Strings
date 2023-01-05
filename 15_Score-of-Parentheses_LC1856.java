class Solution {
    public int scoreOfParentheses(String s) {

        //Approach1 -- TC:O(N) SC:O(N)
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
            }
            else{
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                    st.push('1');
                }
                else{
                    int sum =0;
                    while(!st.isEmpty() && st.peek() != '('){
                        sum += (st.pop()-'0');
                    } 
                    st.pop();
                    st.push((char)(2*sum +'0'));
                }
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum+=(st.pop()-'0');
        }
        return sum;
        
    }
}