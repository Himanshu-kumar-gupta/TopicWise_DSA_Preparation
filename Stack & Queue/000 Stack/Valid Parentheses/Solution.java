class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        st.add(s.charAt(0));
        for(int i=1;i<s.length();i++) {
            char temp= s.charAt(i);
            if(temp== '(' || temp== '{' || temp== '[')
                st.add(temp);
            
            if(st.isEmpty())
                return false;
            
            switch(temp) {
                case ')' : if(st.pop()!='(')
                                return false;
                           break;
                case '}' : if(st.pop()!='{')
                                return false;
                           break;
                case ']' : if(st.pop()!='[')
                                return false;
            }
        }
        
        return st.isEmpty();
    }
}
