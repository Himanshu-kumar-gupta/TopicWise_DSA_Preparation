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
    fun mergeInBetween(list1Fixed: ListNode?, a: Int, b: Int, list2Fixed: ListNode?): ListNode? {        
        var list1=list1Fixed
        var list2=list2Fixed
        var i=0
        
        while(i++<a-1)
            list1=list1!!.next
        
        val change1 = list1
        
        i--
        while(i++<b+1)
            list1=list1?.next
        
        change1?.next=list2
        
        while(list2?.next!=null)
            list2=list2.next
        
        list2?.next=list1
        
        return list1Fixed
    }
}
