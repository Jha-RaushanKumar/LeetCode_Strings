class Solution {
    public int lengthOfLongestSubstring(String s) {


        //Approach1 -- TC:O(N) SC:O(N)
        Queue<Character> q = new LinkedList<>();
        int max = 0;
        for(int i=0;i<s.length();i++){
            while(q.contains(s.charAt(i))){
                q.remove();
            }
            q.add(s.charAt(i));
            max = Math.max(max,q.size());
        }
        return max;
        
    }
}