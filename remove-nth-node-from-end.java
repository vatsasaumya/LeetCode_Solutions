/* https://leetcode.com/problems/remove-nth-node-from-end-of-list/ */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int c = 1;
        while(curr.next!=null)
        {
            curr = curr.next;
            c++;
        }
        if(n > c)
            return null;
        if(n==1 && head.next == null)
            return null;
        ListNode temp = null;
        curr = head;
        if(c - n == 0)
            return head.next;
        for(int i = 0;i < c-n-1;i++)
        {
            if(curr!=null && curr.next!=null)
                curr = curr.next;
        }
        if(curr!=null && curr.next!=null)
        {
            temp = curr.next;
            curr.next = temp.next;
        }
        return head;
    }
}