class Solution {
    fun isValid(s: String): Boolean {
        val st = Stack<Char>()
        
        for(c in s)
            when(c) {
                '(' -> st!!.add(')')
                '{' -> st!!.add('}')
                '[' -> st!!.add(']')
                else ->  if(st.isEmpty() || st!!.pop()!=c)
                                return false
            }
        
        return st.isEmpty()
    }
}
