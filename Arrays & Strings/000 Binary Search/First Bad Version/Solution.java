/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=0,end=n,res=-1;
        
        while(start<=end) {
            int mid=start+(end-start)/2;
            
            //If bad version lies on mid then
            //make it a candidate
            //first bad version or first occurence will lie on its left
            if(isBadVersion(mid)) {
                res=mid;
                end=mid-1;
            }
            else {
                //If mid is not bad then bad version will lie on its right
                start=mid+1;
            }
        }
        
        return res;
    }
}
