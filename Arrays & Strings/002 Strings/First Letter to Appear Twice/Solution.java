class Solution {
    public char repeatedCharacter(String s) {
        int count[]= new int[26];
        
        for(int i=0;i<s.length();i++) {
            if(count[s.charAt(i)-'a']==1)
                return s.charAt(i);
            else
                count[s.charAt(i)-'a']++; 
        }

        return 'a';
    }
}
