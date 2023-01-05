class Solution {
    public String reverseWords(String s) {

        //Approach1 -- TC:O(N) SC:O(N)
        String ans = "";
        String arr[] = s.trim().split("\\s+");
        for(int i=arr.length-1;i>0;i--){
            ans += arr[i]+" ";
        }
        ans += arr[0];
        return ans;
        
    }
}