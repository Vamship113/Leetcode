class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        int n=nums1.length;
        long left = -10000000000L, right = 10000000000L;
        while(left<=right){
            long count=0;
            long mid=(left+right)/2;
            for(int i=0;i<n;i++){
                count+=hasGoodCount(nums2,nums1[i],mid);
            }
            if(count<k) left=mid+1;// implies product lies on the right side of mid

            else right=mid-1; // else left side of mid

        }
        return left;
    }
    int hasGoodCount(int[] nums2,int x1,long v){
        int n2=nums2.length;
        int left=0,right=n2-1;
        while(left<=right){
            int mid=(left+right)/2;
            long prod=(long)nums2[mid]*x1;
            if((x1>=0 && prod<=v) || (x1<0 && prod>v)) left=mid+1;
            else right=mid-1;
        }
        if(x1>=0) return left;
        else return n2-left;
    }
}