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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int i=0;
        ListNode head = list1;
        while(i++<a-1)
            list1=list1.next;
        
        ListNode change1 = list1;
        
        i--;
        while(i++<b+1)
            list1=list1.next;
        
        change1.next=list2;
        
        while(list2.next!=null)
            list2=list2.next;
        
        list2.next=list1;
        
        return head;
    }
}
