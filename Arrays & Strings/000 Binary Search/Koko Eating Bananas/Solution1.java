class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int hrReq, k, max = -1, start=1,end;

        for(int i=0;i<piles.length;i++)
            if(piles[i]>max)
                max = piles[i];
        
        end = max;
        k=max;
      
        while(start<=end) {
        
            int mid = start + (end-start)/2;
            hrReq=0;
            for(int i = 0;i<piles.length;i++)
              //ceil makes it easy to read but type conversion takes time and is not suited for competitive programming
              // Thus, we removed it in next Solution
              // we convert one of the value to double so that the division result is double, otherwise divison result will be int and ceil would not be found
                hrReq +=Math.ceil((double)piles[i]/mid); 

            if(hrReq<=h){
                k=mid;
                end = mid -1;
            }
            else
                start=mid+1;
        }

        return k;      
    }
}
