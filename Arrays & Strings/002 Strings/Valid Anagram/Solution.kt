class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val len=s.length
        if(len!=t.length)
            return false
        
        val count= IntArray(26)
        
        //Add count to array
        for(c in s)
            count[c-'a']++
        
        //Subtract count from array
        for(c in t)
            count[c-'a']--
        
        //Check if addition=subtraction
        for(i in count)
            if(i!=0)
                return false
        
        return true
    }
}
