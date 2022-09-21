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
    fun deleteDuplicates(head: ListNode?): ListNode? {
        head?.next ?: return head
        
        var temp=head     
        temp.next=deleteDuplicates(temp.next)
        
        return if(temp.`val`==temp.next.`val`) temp.next else temp
    }
}
