class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events,(a,b)->a[0]-b[0]);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int time=1;
        int attended=0;
        int pos=0;
        int n=events.length;
        while(pos<n || !minHeap.isEmpty()){
            if(minHeap.isEmpty()){
                time=Math.max(time,events[pos][0]);
            }

            while(pos<n && events[pos][0]==time){
                minHeap.offer(events[pos][1]);
                pos++;
            }

            while(!minHeap.isEmpty() && minHeap.peek()<time) minHeap.poll();

            if(!minHeap.isEmpty()){
                attended++;
                minHeap.poll();
            }
            time++;
        }
        return attended;
    }
}

/*



*/