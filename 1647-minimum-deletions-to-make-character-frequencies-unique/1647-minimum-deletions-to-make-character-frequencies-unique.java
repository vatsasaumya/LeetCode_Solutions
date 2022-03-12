class Solution {
    public int minDeletions(String s) {
       int[] occurrence = new int[26];
        for(int i=0; i<s.length(); i++)
        {
            occurrence[s.charAt(i)-'a']++;
        }
        int count = 0;
        Set<Integer> set = new HashSet<Integer>();
        for(int i : occurrence)
        {
            if(i==0)
                continue;
            while(set.contains(i) && i>0)
            {
                i--;
                count++;
            }
            if(i!=0)
            set.add(i);
        }
        return count;
    }
}