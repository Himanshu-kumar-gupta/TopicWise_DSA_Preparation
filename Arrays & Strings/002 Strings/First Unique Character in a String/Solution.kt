class Solution {
    fun firstUniqChar(s: String): Int {
        val count= IntArray(26)
        
        for(c in s)
            count[c-'a']++
    
        // i is index, c is char
        for((i,c) in s.withIndex())
            if(count[c-'a']==1)
                return i

        return -1
    }
}
