/* https://leetcode.com/problems/swap-nodes-in-pairs/ */

class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode curr = head;
        int temp = 0;
        while(curr!=null && curr.next!=null)
        {
            temp = curr.val;
            curr.val = curr.next.val;
            curr.next.val = temp;
            curr = curr.next.next;
            
        }
        return head;
    }
}
