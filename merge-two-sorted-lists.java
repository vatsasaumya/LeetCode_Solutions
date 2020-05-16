/* https://leetcode.com/problems/merge-two-sorted-lists/ */
ListNode newHead = new ListNode(0);
        ListNode head1 = new ListNode(0);
        ListNode head2 = new ListNode(0);
        ListNode mergedList = newHead;
        while(l1!=null || l2!=null)
        {
            if(l1!=null && l2!=null && l2.val < l1.val)
            {
                mergedList.next = l2;
                l2 = l2.next;
            }
            else if(l1!=null && l2!=null && l2.val >= l1.val)
            {
                mergedList.next = l1;
                l1 = l1.next;
            }
            else if(l1 == null)
            {
                mergedList.next = l2;
                l2 = l2.next;
            }
             else if(l2 == null)
            {
                mergedList.next = l1;
                l1 = l1.next;
            }
            mergedList = mergedList.next;
            
        }
        return newHead.next;