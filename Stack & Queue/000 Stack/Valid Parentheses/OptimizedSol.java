class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        
        for(int i=0;i<s.length();i++)
            switch(s.charAt(i)) {
                case '(' : st.add(')');
                           break;
                case '{' : st.add('}');
                           break;
                case '[' : st.add(']');
                           break;
                default :  if(st.isEmpty() || st.pop()!=s.charAt(i))
                                return false; 
            }
        
        return st.isEmpty();
    }
}
