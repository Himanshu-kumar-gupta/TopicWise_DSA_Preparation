/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //Tortoise and Hare
        ListNode t=head;
        ListNode h=head;
        
        if(head==null || head.next==null)
            return false;
        
        while(h!=null && h.next!=null) {
            t=t.next;
            h=h.next.next;
            
            if(t==h)
                return true;
        }
        
        return false;
    }
}
