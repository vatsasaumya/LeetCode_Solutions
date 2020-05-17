/* https://leetcode.com/problems/middle-of-the-linked-list/ */

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        int c = 1;
        while(curr.next!=null)
        {
            c++;
            curr = curr.next;
            
        }
        curr = head;
        ListNode pre = head;
        if(c%2!=0)
        {
            int j = 1;
            while(j <= c/2)
            {
                curr = curr.next;
                j++;
            }
        }
        else
        {
            int j = 1;
            while(j <= c/2)
            {
                pre = curr;
                curr = curr.next;
                j++;
                
            }
        }
        return curr;
        
    }
}