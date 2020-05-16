/* https://leetcode.com/problems/reverse-integer/ */

class Solution {
    public int reverse(int x) {
        long rev = 0;
        while(x!=0){
            int rem = x%10;
            rev = (rev*10)+rem;
            x = x/10;
        }
        String s = String.valueOf(rev);
        int i = 0;
        while(s.charAt(i) == 0)
        {
            i++;
        }
        String str = s.substring(i,s.length());
        rev =Long.valueOf(str);
        
        if(rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE)
            return 0;
        else
            return (int)rev;
        
    }
}