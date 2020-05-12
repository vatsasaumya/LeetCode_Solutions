/* https://leetcode.com/problems/valid-parentheses/ */

class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<Character>();
        char c;
        for(int i = 0;i < s.length();i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
            {
                c = s.charAt(i);
                s1.push(c);
            }
            if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')
            {
                if(s1.isEmpty())
                    return false;
                else
                {
                    char prev = s1.peek();
                    if((prev == '(' && s.charAt(i) == ')') || (prev == '{' && s.charAt(i) == '}') || (prev == '[' && s.charAt(i) == ']'))
            {
                s1.pop();
            }
                    else
                    {
                        s1.push(s.charAt(i));
                    }
                    
                }
            }
                    
        }
        if(s1.isEmpty())
            return true;
        else
            return false;
        
    }
}