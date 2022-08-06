class Solution {
    public int pivotIndex(int[] nums) {
        int len=nums.length;
        int sums[]=new int[len];
        sums[0]=0;

        //Adding left sum to array
        for(int i=1;i<len;i++) 
            sums[i]=sums[i-1]+nums[i-1];
        
        //Comapring left sum to right sum
        for(int i=0;i<len;i++) 
            //Right sum = total sum(sum at last+last element) - sum at position - element at position
            if(sums[i]==(sums[len-1]+nums[len-1]-sums[i]-nums[i]))
                return i;
        
        return -1;
    }
}
