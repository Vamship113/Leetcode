class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n=nums.length;
        int[] line = new int[n+1];
        for(int i=0;i<queries.length;i++){
            int start=queries[i][0];
            int end=queries[i][1];
            line[start]+=1;
            line[end+1]-=1;
        }
        for(int i=1;i<n;i++){
            line[i]+=line[i-1];
        }
        for(int i=0;i<n;i++){
            if(nums[i]>line[i]) return false;
        }
        return true;
    }
}