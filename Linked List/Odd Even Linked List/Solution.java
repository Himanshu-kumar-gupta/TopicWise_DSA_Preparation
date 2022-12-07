/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head!=null) {
            //Start odd and even at suitable position
            ListNode odd= head ,even = head.next, evenHead = even;

            while(even!=null && even.next!=null) {
                //update both odd and even to avoid cycle
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd=odd.next;
                even=even.next;
            } 

            odd.next=evenHead;
        }
        
        return head;
    }
}
