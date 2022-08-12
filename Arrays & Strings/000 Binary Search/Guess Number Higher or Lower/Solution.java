/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start=1,end=n;
        
        while(start<=end) {
            //To avoid int value overflow
            int mid=start+(end-start)/2;
            
            if(guess(mid)==0)
                return mid;
            else if(guess(mid)==-1)
                //If pick is lower reduce search space to left half 
                end=mid-1;
            else
                //If pick is higher reduce search space to right half 
                start=mid+1;
        }
        
        return -1;
    }
}
