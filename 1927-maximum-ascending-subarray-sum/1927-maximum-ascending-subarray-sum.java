class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxsum=0;
        int n=nums.length;
        int sum=0;
        if(n==1) return nums[0];
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                sum+=nums[i];
            }
            else{
                maxsum=Math.max(sum+nums[i],maxsum);
                sum=0;
            }
        }
        if(nums[n-2]<nums[n-1]){
            maxsum=Math.max(sum+nums[n-1],maxsum);
        }
        return maxsum;
    }
}