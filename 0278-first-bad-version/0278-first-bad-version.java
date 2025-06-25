/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left=1,right=n;
        int firstVersion=1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(isBadVersion(mid)){
                // if((mid==0) || (mid>0 && !isBadVersion(mid-1)))  return mid;
                // else right=mid-1;
                right=mid-1;
            }
            else left=mid+1;
        }
    return left;
    }
}