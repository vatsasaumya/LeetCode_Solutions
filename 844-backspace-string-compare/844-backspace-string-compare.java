class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> t1 = new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)!='#')
                s1.push(s.charAt(i));
            else
            {
                if(!s1.isEmpty())
             {
                if(s.charAt(i)=='#')
                {
                s1.pop();
                } 
             }
            else
            {
                continue;
            }
            
        }
        }
        for(int j=0; j<t.length(); j++)
        {
           if(t.charAt(j)!='#')
                t1.push(t.charAt(j));
            else
            {
                if(!t1.isEmpty())
             {
                if(t.charAt(j)=='#')
                {
                t1.pop();
                } 
             }
            else
            {
                continue;
            }
            
        }
        }
        if(s1.size()!=t1.size())
            return false;
        else
        {
            while(!s1.isEmpty())
            {
                if(s1.peek()!=t1.peek())
                    return false;
                else
                {
                    s1.pop();
                    t1.pop();
                }
            }
        }
        return true;
        
    }
}