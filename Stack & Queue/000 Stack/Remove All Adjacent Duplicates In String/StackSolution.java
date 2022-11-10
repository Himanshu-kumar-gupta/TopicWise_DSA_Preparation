class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> res = new Stack();
        for(char i: s.toCharArray()) 
            // If top of stack is same as char then remove it due to duplicate
            if(!res.isEmpty() && res.peek()==i)
                res.pop();
            else
                res.add(i);
        
        StringBuilder result = new StringBuilder();
        
        for(char c: res) 
            result.append(c);
        
        return result.toString();        
    }
}
