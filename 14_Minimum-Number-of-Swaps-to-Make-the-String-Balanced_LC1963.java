class Solution {
    public int minSwaps(String s) {

        //Approach1 -- TC:O(N) SC:O(N)
        Stack<Character> st = new Stack<>();
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '['){
                st.push(s.charAt(i));
            }
            else{
                if(!st.isEmpty() && st.peek() == '['){
                    st.pop();
                }
                else{
                    st.push(']');
                }
            }
        }

        int unBalanced = st.size()/2;
        return (unBalanced+1)/2;
        
    }
}