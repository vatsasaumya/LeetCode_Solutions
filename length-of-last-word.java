/* https://leetcode.com/problems/length-of-last-word/ */

class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        String last_word = str.substring(str.lastIndexOf(' ')+1,str.length());
        int length = last_word.length();
        return length;
        
    }
}