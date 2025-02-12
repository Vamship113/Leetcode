class Solution {
    public int maximumSum(int[] nums) {
        int n=nums.length;
        PriorityQueue<Integer>[] storesum = new PriorityQueue[82];
        for(int i=0;i<82;i++){
            storesum[i] = new PriorityQueue<Integer>();
        }
        for(int i=0;i<n;i++){
            int sum=digitSum(nums[i]);
            storesum[sum].add(nums[i]);
            if(storesum[sum].size()>2) storesum[sum].poll();
        }
        int max_sum=-1;
        for(PriorityQueue<Integer> minHeap: storesum){
            if(minHeap.size()==2)
            max_sum=Math.max(max_sum,minHeap.poll()+minHeap.poll());
        }
        return max_sum;
    }
    int digitSum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}