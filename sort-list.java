/* https://leetcode.com/problems/sort-list/ */

class Solution {
    public ListNode sortList(ListNode head) {
        ListNode pre = head;
        int temp = 0;
        if(head == null)
            return null;
        if(head.next == null)
            return head;
        while(pre.next!=null)
        {
            ListNode curr = pre.next;
            while(curr!=null)
            {
                if(curr.val < pre.val)
                {
                    temp = curr.val;
                    curr.val = pre.val;
                    pre.val = temp;
                }
                curr = curr.next;
            }
            pre = pre.next;
           
        }
        return head;
    }
}