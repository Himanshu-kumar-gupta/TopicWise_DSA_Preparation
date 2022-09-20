class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> r= new HashMap<>();
        HashMap<Character,Integer> m=new HashMap<>();
        
        for(int i=0;i<ransomNote.length();i++)
            r.put(ransomNote.charAt(i),r.getOrDefault(ransomNote.charAt(i),0)+1);
        
        for(int i=0;i<magazine.length();i++)
            m.put(magazine.charAt(i),m.getOrDefault(magazine.charAt(i),0)+1);
        
        // System.out.println("r = "+r.toString());
        // System.out.println("m = "+m.toString());
        Set<Character> rSet=r.keySet();
        for(Character c:rSet)
            if(m.containsKey(c)){
                if(m.get(c)<r.get(c))
                    return false;
            }
            else
                return false;

        return true;
    }
}
