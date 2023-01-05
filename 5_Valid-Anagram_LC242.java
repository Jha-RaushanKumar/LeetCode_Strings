class Solution {
    public boolean isAnagram(String s, String t) {

        //Approach1 -- TC:O(N) SC:O(N)
        int freq[] = new int[255];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)]--;
        }

        for(int i=0;i<255;i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;
        
    }
}