class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> minHeap=  new PriorityQueue<>();
        for(int num: nums)
        minHeap.add((long)num);
        int n=nums.length;
        int count=0;
        while(!minHeap.isEmpty()){
            long x=minHeap.poll();
            if(minHeap.isEmpty()) return count;
            long y=minHeap.poll();
            if(x>=k && y>=k) return count;
            else{
                long new_var =Math.min(x,y)*2+Math.max(x,y);
                //System.out.println(x+" "+y+" "+new_var);
                minHeap.add(new_var);
                count++;
            }
        }
        return count;
    }
}