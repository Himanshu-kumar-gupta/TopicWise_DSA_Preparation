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
    public ListNode removeElements(ListNode head, int val) {
      
        //Remove all the eligible preceeding nodes 
        while(head!=null && head.val==val) {
    	    head=head.next;
    	}
        
        //If list is empty or has only 1 node, return the head
        //As the one node will not contain val
        if(head==null || head.next==null)
            return head;
    	
    	ListNode temp=head;
        //Procedure if 2 or more nodes
    	while(temp.next.next!=null) {
    	    if(temp.next.val==val) {
    	        ListNode toJoin=temp.next.next;
    	        temp.next=toJoin;
                continue;
    	    }    	    
    	    temp=temp.next;
    	}
    	
    	if(temp.next.val==val)
    	    temp.next=null;
    	 
	    return head; 
    }
}
