class Solution {
    public String addStrings(String num1, String num2) {

        String ans = "";
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        while(i>=0 || j>=0){
            int sum = 0;
            if(i>=0 && j>=0){
                sum = num1.charAt(i)-'0' + num2.charAt(j)-'0';    
            }
            else if(i>=0){
                sum = num1.charAt(i)-'0';    
            }
            else if(j>=0){
                sum = num2.charAt(j)-'0';    
            }
            sum+=carry;
            carry = sum/10;
            sum = sum%10;
            
            i--;
            j--;

            ans+= String.valueOf(sum);
        }
        if(carry>0){
            ans+= String.valueOf(carry);
        }

        String str = "";
        for(int k = ans.length()-1;k>=0;k--){
            str += ans.charAt(k);
        } 
        return str;      
        
    }
}