class Solution {
    fun repeatedCharacter(s: String): Char {
        val count= IntArray(26)
        
        for(c in s)
            if(count[c-'a']==1)
                return c
            else
                count[c-'a']++

        return 'a'
    }
}
