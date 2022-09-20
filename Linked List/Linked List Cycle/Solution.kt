/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        //Tortoise and Hare
        var t=head
        var h=head
        
         do {
            t=t?.next
            h=h?.next?.next
        }while(h!=null && t!=h)
        
        //Check t!=null for head  node or just after head node=null
        return (t==h && t!=null)
    }
}
