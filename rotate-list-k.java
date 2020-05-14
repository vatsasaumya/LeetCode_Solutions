/* https://leetcode.com/problems/rotate-list/submissions/ */

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0)
            return head;
        
        int length = 1;
        ListNode curr = head;
        while(curr.next != null) {
            curr = curr.next;
            length += 1;
        }
        
        if(length <= k) {
            k = k % length;
            if(k == 0)
                return head;
        }
        
        curr = head;
        int count = 1;
        
        while(count < length - k)
        {
            curr = curr.next;
            count += 1;
        }
        
        ListNode last = curr;
        while(last.next != null) {
            last = last.next;
        }
        
        ListNode newHead = curr.next;
        curr.next = null;
        last.next = head;
        return newHead;
        
    }
}

