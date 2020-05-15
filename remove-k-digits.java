/* https://leetcode.com/problems/remove-k-digits/ */

class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s = new Stack<Character>();
        if(num.length() == k)
            return "0";
        int i = 0;
        while(i < num.length())
        {
            while(k>0 && !s.isEmpty() && s.peek() > num.charAt(i))
            {
                s.pop();
                k--;
            }
            s.push(num.charAt(i));
            i++;
        }
        while(k > 0)
        {
            s.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty())
        {
            sb.append(s.pop());
        }
        sb.reverse();
        
        while(sb.length()>1 && sb.charAt(0)=='0')
            sb.deleteCharAt(0);
        return sb.toString();
        
    }
}