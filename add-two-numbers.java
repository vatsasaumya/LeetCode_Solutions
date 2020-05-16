/* https://leetcode.com/problems/add-two-numbers/ */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode sumHead = new ListNode(0);
        ListNode sumNode = sumHead;
        ListNode prevSumNode = sumNode;
        int carry = 0;
        
        while(l1 != null || l2 != null) {
            int digit1, digit2;
            
            if(l1 != null) 
                digit1 = l1.val;
            else 
                digit1 = 0;
            
            if(l2 != null) 
                digit2 = l2.val;
            else 
                digit2 = 0;
            
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
            
            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            int resultDigit = sum % 10;
            sumNode.val = resultDigit;
            sumNode.next = new ListNode(carry);
            prevSumNode = sumNode;
            sumNode = sumNode.next;
        }
        if(carry == 0)
            prevSumNode.next = null;
        return sumHead;
        
    }
}