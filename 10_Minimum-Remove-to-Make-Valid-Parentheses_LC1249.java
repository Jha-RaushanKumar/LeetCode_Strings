class Solution {
    public String minRemoveToMakeValid(String s) {
        
        //Approach1 -- TC:O(N) SC:O(N)
        Stack<Integer> st = new Stack<>();

        char arr[] = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == '('){
                st.push(i);
            }
            else{
                if(arr[i] == ')'){
                    if(st.isEmpty()){
                        arr[i] = '#';
                    }
                    else{
                        st.pop();
                    }
                }
            }
        }
        while(!st.isEmpty()){
            arr[st.pop()] = '#';
        }

        StringBuilder ans = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(arr[i] != '#'){
                ans.append( (char)(arr[i]));
            }
        }
        return ans.toString();
        
    }
}