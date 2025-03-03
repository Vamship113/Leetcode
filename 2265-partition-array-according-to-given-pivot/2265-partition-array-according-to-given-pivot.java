class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int low=0,high=n-1;
        int[] result = new int[n];
        for(int i=0,j=n-1;i<n;i++,j--){
            if(nums[i]<pivot)
            {
                result[low]=nums[i];
                low++;
            }
            if(nums[j]>pivot)
            {
                result[high]=nums[j];
                high--;
            }
        }
        while(low<=high){
            result[low]=pivot;
            low++;
        }
        return result;
    }
}