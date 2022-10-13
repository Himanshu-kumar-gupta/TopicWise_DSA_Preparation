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
    fun deleteNode(node: ListNode?) {
        var toDelete = node
        toDelete?.`val` = node?.next?.`val`
        toDelete?.next = node?.next?.next
    }
}
