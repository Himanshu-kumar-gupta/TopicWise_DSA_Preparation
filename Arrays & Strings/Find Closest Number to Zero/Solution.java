class Solution {
    public int findClosestNumber(int[] nums) {
        int close=nums[0];
        for(int i=1;i<nums.length;i++) {
            int c=Math.abs(close);
            
            //Change if absolute value is less than closest
            //if equal take the positive value
            if(Math.abs(nums[i])<c || nums[i]==c)
                close=nums[i];
        }
            
        return close;
    }
}
