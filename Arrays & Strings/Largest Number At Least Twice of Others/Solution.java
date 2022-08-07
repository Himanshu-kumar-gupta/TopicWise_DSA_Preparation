class Solution {
    public int dominantIndex(int[] nums) {
        int largest=nums[0];
        int secondLargest=-1;
        int largestIndex=0;
        
        for(int i=1;i<nums.length;i++) {
            //if larger no found at index then 
            //second largest = previous larger no
            //largest = larger no
            if(nums[i]>largest) {
                secondLargest=largest;
                largest=nums[i];
                largestIndex=i;
            }

            //Check if largest no is at index 1
            //Then second largest will be after that
            //Consider [1,0]
            if(nums[i]<largest && nums[i]>secondLargest)
                secondLargest=nums[i];
        }
        
        if(2*secondLargest<=largest)
            return largestIndex;
        else
            return -1;
        
    }
}
