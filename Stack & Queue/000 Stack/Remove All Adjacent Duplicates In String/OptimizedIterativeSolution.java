class Solution {
    public String removeDuplicates(String s) {
        int pos=-1;
        StringBuilder result = new StringBuilder();
        for(char i: s.toCharArray())
            // If top of stack is same as char then remove it due to duplicate
            if(pos>=0 && result.charAt(pos)==i)
                result.deleteCharAt(pos--);
            else {
                pos++;
                result.append(i);
            }

        return result.toString();        
    }
}
