class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int k, max = -1, start=1,end;
        long hrReq;
        for(int i=0;i<piles.length;i++)
            if(piles[i]>max)
                max = piles[i];
        
        end = max;
        k=max;
        while(start<=end) {
        
            int mid = start + (end-start)/2;
            hrReq=0;
            for(int i = 0;i<piles.length;i++){
                hrReq +=piles[i]/mid;
                if(piles[i]%mid!=0)
                    hrReq++;
            }
          
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
