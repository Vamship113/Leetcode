class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc=1;
        int dec=1;
        int max=1;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                inc++;
                max=Math.max(max,dec);
                dec=1;

            }else if(nums[i]>nums[i+1]){
                dec++;
                max=Math.max(max,inc);
                inc=1;
            }else{
                max=Math.max(max,(Math.max(inc,dec)));
                inc=1;
                dec=1;
            }
        }
        max=Math.max(max,(Math.max(inc,dec)));
        return max;
    }
}