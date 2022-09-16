class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> nCount = new HashMap();
        List<Integer> res = new ArrayList();
        
        //Add the count of each element of one array in HashMap 
        for(int i:nums1) 
            nCount.put(i,nCount.getOrDefault(i,0)+1);
        
        
        for(int i:nums2) {
            //If HashMap contains the key with valid count add it to result 
            //and subtract count of element in HashMap by 1
            if(nCount.containsKey(i) && nCount.get(i)>0) {
                res.add(i);
                nCount.put(i,nCount.get(i)-1);
            }
        }
        
        //Convert ArrayList to array
        int nums[] = new int[res.size()];    
        int i=0;
        for(int val:res) 
            nums[i++] = val;
        
        return nums;
    }
}
