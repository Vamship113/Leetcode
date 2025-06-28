class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[0]-a[0]);
        int len=nums.length;
        for(int i=0;i<len;i++){
            pq.offer(new int[]{nums[i],i});
        }
        PriorityQueue<int[]> indBased = new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(int i=0;i<k;i++){
            indBased.offer(pq.poll());
        }

        //ans
        int[] ans= new int[k];
        int ind=0;
        while(!indBased.isEmpty()){
            ans[ind++]=indBased.poll()[0];
        }

        return ans;
    }
}