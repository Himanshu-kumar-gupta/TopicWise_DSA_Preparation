class Solution {
    public int removeDuplicates(int[] nums) {
        int unqPos = 1;
        for(int i=1;i<nums.length;i++)
            // If no duplicacy found add element at unique pos
            if(nums[i]!=nums[i-1])
                nums[unqPos++] = nums[i];
        
        return unqPos;
    }
}
