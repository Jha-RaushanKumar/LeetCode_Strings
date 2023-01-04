class Solution {
    public boolean validPalindrome(String s) {
        
        //Approach1 -- TC:O(N) SC:O(1)
        int i = 0;
        int j = s.length()-1;

        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return isPalindrome(s,i,j-1) || isPalindrome(s,i+1,j);
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isPalindrome(String s, int i, int j){
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}