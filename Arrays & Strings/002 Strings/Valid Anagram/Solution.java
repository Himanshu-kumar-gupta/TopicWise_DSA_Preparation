import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        int len=s.length();
        if(len!=t.length())
            return false;
        
        int count[] = new int[26];
        
        //Add count to array
        for(int i=0;i<len;i++)
            count[s.charAt(i)-'a']++;
        
        //Subtract count from array
        for(int i=0;i<len;i++)
            count[t.charAt(i)-'a']--;
        
        //Check if addition=subtraction
        for(int i:count)
            if(i!=0)
                return false;
        
        return true;
    }
}
