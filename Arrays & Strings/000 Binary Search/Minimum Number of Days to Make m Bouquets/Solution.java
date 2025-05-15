class Solution {
    public int minDays(int[] bloomDay, int m, int k) {  

        int start =bloomDay[0], end = bloomDay[0], resDay = -1, len = bloomDay.length;
        if(m*k > len)
            return -1;

        for(int i =1;i<bloomDay.length;i++) {
            if(bloomDay[i]<start)
                start = bloomDay[i];
            if(bloomDay[i]>end)
                end = bloomDay[i];
        }
        
        while(start<=end) {
            int mid = start + (end - start)/2;

            int kCount = 0, mCount = 0;
            for(int i=0;i<len;i++) {
                if(bloomDay[i]<=mid)
                    kCount++;
                else
                    kCount = 0;
                
                if(kCount==k) {
                    kCount=0;
                    mCount++;
                }
            }

            if(mCount>=m) {
                resDay = mid;
                end = mid - 1;
            }
            else
                start = mid +1;
        }

        return resDay;
    }
}
