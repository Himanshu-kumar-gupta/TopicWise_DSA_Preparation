class Solution {
    public int removeElement(int[] nums, int val) {
        int last=nums.length-1;
        boolean flag;
        do{
            flag=false;
            for(int i=0;i<=last;i++)
                if(nums[i]==val){
                    nums[i]=nums[last];
                    last--;
                    //If the last value being replced is val then
                    //In search space we have a val, so again repeat the loop
                    if(nums[i]==val)
                        flag=true;
                }
        }while(flag);
             
        return last+1;
    }
}
