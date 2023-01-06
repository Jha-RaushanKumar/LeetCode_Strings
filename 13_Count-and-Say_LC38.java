class Solution {
    public String countAndSay(int n) {

        //Approach1 -- TC:O(N^2) SC:O(1)
        String ans = "1";
        for(int i=1;i<n;i++){
            ans = countAndSayHelper(ans);
        }
        return ans;        
    }

    public static String countAndSayHelper(String s){

        int count = 1;
        char prev = s.charAt(0);
        String ans="";
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == prev){
                count++;
            }
            else{
                ans = ans + String.valueOf(count) + prev;
                prev = s.charAt(i);
                count = 1;
            }
        }
        ans = ans + String.valueOf(count) + prev;
        return ans;

    }
}