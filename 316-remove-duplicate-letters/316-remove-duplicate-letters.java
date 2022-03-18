class Solution {
    public String removeDuplicateLetters(String s) {
        int[] last = new int[26];
        for(int i=0; i<s.length(); i++)
            last[s.charAt(i) - 'a'] = i;
        boolean[] visited = new boolean[26];
        Stack<Character> stk = new Stack<Character>();
        for(int j=0; j<s.length(); j++)
        {
            if(visited[s.charAt(j)-'a'])
                continue;
            while(!stk.isEmpty() && stk.peek() > s.charAt(j) && last[stk.peek()-'a'] > j)
            {
                visited[stk.peek()-'a'] = false;
                stk.pop();
            }
            visited[s.charAt(j)-'a'] = true;
            stk.push(s.charAt(j));
        }
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty())
        {
            sb.append(stk.pop());
        }
        String result = sb.reverse().toString();
        return result;
    }
    
}