class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val count= IntArray(26)
                
        for(i in magazine)
            count[i-'a']++
        
        for(i in ransomNote)
            //If ransomNote contains any character or more number of character than magazine
            //it cannot be constructed
           if(--count[i-'a']<0)
               return false

        return true
    }
}
