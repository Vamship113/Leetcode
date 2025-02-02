class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n-1){
            if(nums[i]>nums[i+1])
            break;
            i++;
        }
        if(i==n-1) return true;
        i++;
        while(i>0){
            int temp=nums[0];
            for(int j=0;j<n-1;j++){
                nums[j]=nums[j+1];
            }
            nums[n-1]=temp;
            i--;
        }
        for(int j=0;j<n-1;j++){
                if(nums[j]>nums[j+1]) return false;
         }
         return true;
    }
}